/**
 * 
 */
package franco.maurizio.unit20.news.of.java11.f.new_http_client_api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * 
 * Introduced into Java 11, we see new http client api
 * 
 * @author maurizio.franco@ymail.com
 */
public class NewHttpClientApi {

	public static void main(String[] args) throws IOException, InterruptedException {
		HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
				.connectTimeout(Duration.ofSeconds(20)).build();
		HttpRequest httpRequest = HttpRequest.newBuilder().GET().uri(URI.create("http://www.google.com")).build();
		HttpResponse httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
		System.out.println(httpResponse.body());
	}

}
