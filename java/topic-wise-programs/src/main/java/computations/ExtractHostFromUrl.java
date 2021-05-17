package computations;

import java.net.URI;
import java.net.URISyntaxException;

public class ExtractHostFromUrl {
		public static void main(String[] args) throws URISyntaxException {
				String url = "https://subdomain.example.com/somepath/someendpoint";
				URI uri = new URI(url);
				String domain  = uri.getHost();
				System.out.println(domain);
		}
}
