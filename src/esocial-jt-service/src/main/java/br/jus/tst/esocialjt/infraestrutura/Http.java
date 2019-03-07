package br.jus.tst.esocialjt.infraestrutura;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.commons.io.IOUtils;

public class Http {
	
	public String post(String url, String payload) throws IOException {
		HttpClient http = new HttpClient();
		PostMethod post = new PostMethod(url);
		post.setRequestEntity(new StringRequestEntity(payload, "text/xml", "UTF-8"));
		int statusCode = http.executeMethod(post);
		if(statusCode != 200) {
			throw new IOException("POST: O servidor " + url + " retornou o codigo " + statusCode);
		}
		return IOUtils.toString(post.getResponseBodyAsStream(), "UTF-8");
	}
	
	public String get(String url) throws IOException {
		HttpClient http = new HttpClient();
		GetMethod get = new GetMethod(url);
		int statusCode = http.executeMethod(get);
		if(statusCode != 200) {
			throw new IOException("GET: O servidor " + url + " retornou o codigo " + statusCode);
		}
		return IOUtils.toString(get.getResponseBodyAsStream(), "UTF-8");
	}
}
