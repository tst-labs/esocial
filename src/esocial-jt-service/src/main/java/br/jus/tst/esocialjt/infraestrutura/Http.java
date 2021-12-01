package br.jus.tst.esocialjt.infraestrutura;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Http {
	
	public String post(String url, String payload) throws IOException {
		HttpPost post = new HttpPost(url);
		post.setEntity(new StringEntity(payload, ContentType.create("text/xml", "UTF-8")));
		
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
	             CloseableHttpResponse response = httpClient.execute(post)) {
			int statusCode = response.getStatusLine().getStatusCode();
			if(statusCode != 200) {
				throw new IOException("POST: O servidor " + url + " retornou o codigo " + statusCode);
			}

	       return EntityUtils.toString(response.getEntity(), "UTF-8");
	   }
	}
	
	public String get(String url) throws IOException {
		HttpGet request = new HttpGet(url);
		try (CloseableHttpClient httpClient = HttpClients.createDefault();
	             CloseableHttpResponse response = httpClient.execute(request)) {
			int statusCode = response.getStatusLine().getStatusCode();
			if(statusCode != 200) {
				throw new IOException("GET: O servidor " + url + " retornou o codigo " + statusCode);
			}
			return EntityUtils.toString(response.getEntity(), "UTF-8");
		}
	}
}
