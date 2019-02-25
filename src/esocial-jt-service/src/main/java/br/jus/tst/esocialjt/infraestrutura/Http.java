package br.jus.tst.esocialjt.infraestrutura;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.IOUtils;

public class Http {
	
	private String url;

	public Http(String url) {
		this.url = url;
	}
	
	public String post(String payload) throws IOException {
		HttpClient http = new HttpClient();
		PostMethod post = new PostMethod(url);
		post.setRequestEntity(new StringRequestEntity(payload, "text/xml", "UTF-8"));
		int statusCode = http.executeMethod(post);
		if(statusCode != 200) {
			throw new IOException("O servidor " + url + " retornou o codigo " + statusCode);
		}
		return IOUtils.toString(post.getResponseBodyAsStream(), "UTF-8");
	}
}
