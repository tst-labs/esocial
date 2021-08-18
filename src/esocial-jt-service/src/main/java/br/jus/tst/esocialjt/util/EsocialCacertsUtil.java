package br.jus.tst.esocialjt.util;

import javax.net.ssl.*;
import java.io.*;
import java.security.*;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

public class EsocialCacertsUtil {

    public static void main(String[] args) {
        gerarCacert();
    }

    private static void gerarCacert() {
        String cacert = "/d/eSocialCacerts";

        try {
            File arquivoCacert = getFileCacert(cacert);
            char[] senha = "changeit".toCharArray();

            KeyStore ks;
            try (InputStream in = new FileInputStream(arquivoCacert)) {
                ks = KeyStore.getInstance(KeyStore.getDefaultType());
                ks.load(in, senha);
            }

            endpoints().forEach(endpoint -> get(endpoint, ks));

            try (OutputStream out = new FileOutputStream(cacert)) {
                ks.store(out, senha);
            }

        } catch (Exception e) {
            error(e.toString());
        }
    }

    private static File getFileCacert(String cacert) {
        File arquivoCacert = new File(cacert);

        if (arquivoCacert.isFile()) arquivoCacert.delete();

        if (!arquivoCacert.isFile()) {
            File dir = new File(System.getenv("JAVA_HOME") + "/jre/lib/security");
            arquivoCacert = new File(dir, "cacerts");
        }

        return arquivoCacert;
    }

    private static void get(String host, KeyStore ks) {
        try {
            SSLContext context = SSLContext.getInstance("TLS");
            TrustManagerFactory tmf = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            tmf.init(ks);
            X509TrustManager defaultTrustManager = (X509TrustManager) tmf.getTrustManagers()[0];
            SavingTrustManager tm = new SavingTrustManager(defaultTrustManager);
            context.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory factory = context.getSocketFactory();

            SSLSocket socket = (SSLSocket) factory.createSocket(host, 443);
            socket.setSoTimeout(30 * 1000);
            try {
                socket.startHandshake();
                socket.close();
            } catch (SSLHandshakeException e) {
                /* NESTE MOMENTO O ARQUIVO AINDA NÃO ESTÁ GERADO, (CONTINUE) */
            } catch (SSLException e) {
                error(host + "| " + e.toString());
            }

            X509Certificate[] chain = tm.chain;
            if (chain == null) {
                error("| Não pode obter cadeia de certificados");
            } else {
                MessageDigest sha1 = MessageDigest.getInstance("SHA1");
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                for (int i = 0; i < chain.length; i++) {
                    X509Certificate cert = chain[i];
                    sha1.update(cert.getEncoded());
                    md5.update(cert.getEncoded());

                    String alias = host + "-" + (i);
                    ks.setCertificateEntry(alias, cert);
                }
            }
        } catch (NoSuchAlgorithmException | KeyStoreException | CertificateEncodingException | KeyManagementException | IOException e) {
            error(host + "| " + e.toString());
        }
    }

    private static void error(String log) {
        System.out.println("ERROR: " + log);
    }

    private static List<String> endpoints() {
        List<String> endpoints = new ArrayList<>();
        //e-Social PRODUCAO_RESTRITA
        endpoints.add("webservices.producaorestrita.esocial.gov.br");
        //e-Social PRODUCAO
        endpoints.add("webservices.consulta.esocial.gov.br");
        endpoints.add("webservices.envio.esocial.gov.br");
        //EFD-REINF PRE_PRODUCAO
        endpoints.add("preprodefdreinf.receita.fazenda.gov.br");
        //EFD-REINF PRODUCAO
        endpoints.add("reinf.receita.fazenda.gov.br");
        return endpoints;
    }

    private static class SavingTrustManager implements X509TrustManager {
        private final X509TrustManager tm;
        private X509Certificate[] chain;

        SavingTrustManager(X509TrustManager tm) {
            this.tm = tm;
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }

        public void checkClientTrusted(X509Certificate[] chain, String authType) {
            throw new UnsupportedOperationException();
        }

        public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
            this.chain = chain;
            this.tm.checkServerTrusted(chain, authType);
        }
    }
}
