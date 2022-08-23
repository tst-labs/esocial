package br.jus.tst.esocialjt.util;

import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public final class Resource {
	private Resource() { }
	
	public static InputStream asStream(String resourcePath) {
		return Thread
			.currentThread()
			.getContextClassLoader()
			.getResourceAsStream(resourcePath);
	}
	
	public static String asString(String resourcePath) throws IOException {
		return IOUtils.toString(asStream(resourcePath), StandardCharsets.UTF_8);
	}
	
	public static URL url(String resourcePath) {
		return Thread
				.currentThread()
				.getContextClassLoader()
				.getResource(resourcePath);
	}

}
