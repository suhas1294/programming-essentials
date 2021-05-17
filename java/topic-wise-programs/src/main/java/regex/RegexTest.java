package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
	public static void main(String args[]){
		String regex = "((https://lifehacker.com/*)(.*(,)))";
		String body = "2019-05-22 17:51:15,724 TRACE httpclient.HttpResponse (HttpResponse.java:<init>(109)) - Page processed using: Chromium, Time taken: 5,218, Concurrent requests on host: 1, URL: https://lifehacker.com/hone-your-eye-for-fake-online-reviews-5511726, Execution Log: PUPPET_LOG: INPUT_JSON = {\"url\":\"https://lifehacker.com/hone-your-eye-for-fake-online-reviews-5511726\",\"user_agent\":\"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3679.0 Safari/537.36 (examplebot/examplebot-1 https://example.com; dev-alerts at example dot com)\",\"position\":0} StartLoading >  IgnoredImages >  AuthInfo_NOT_PRESENT >  GettingContent >  ClosingBrowser >  GOTContent > LENGTH == 897461\n" +
				"2019-05-22 17:51:22,005 TRACE httpclient.HttpResponse (HttpResponse.java:<init>(109)) - Page processed using: Chromium, Time taken: 5,269, Concurrent requests on host: 1, URL: https://lifehacker.com/gvnotifier-adds-full-google-contacts-access-and-windows-5580358, Execution Log: PUPPET_LOG: INPUT_JSON = {\"url\":\"https://lifehacker.com/gvnotifier-adds-full-google-contacts-access-and-windows-5580358\",\"user_agent\":\"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3679.0 Safari/537.36 (examplebot/examplebot-1 https://example.com; dev-alerts at example dot com)\",\"position\":0} StartLoading >  IgnoredImages >  AuthInfo_NOT_PRESENT >  GettingContent >  ClosingBrowser >  GOTContent > LENGTH == 910548\n" +
				"2019-05-22 17:51:28,645 TRACE httpclient.HttpResponse (HttpResponse.java:<init>(109)) - Page processed using: Chromium, Time taken: 5,566, Concurrent requests on host: 1, URL: https://lifehacker.com/hacker-challenge-hack-your-laundry-1132379860, Execution Log: PUPPET_LOG: INPUT_JSON = {\"url\":\"https://lifehacker.com/hacker-challenge-hack-your-laundry-1132379860\",\"user_agent\":\"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3679.0 Safari/537.36 (examplebot/examplebot-1 https://example.com; dev-alerts at example dot com)\",\"position\":0} StartLoading >  IgnoredImages >  AuthInfo_NOT_PRESENT >  GettingContent >  ClosingBrowser >  GOTContent > LENGTH == 908079";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(body);
		if (m.find()) {
			System.out.println(m.group(0));
			System.out.println(m.group(1));
			System.out.println(m.group(2));
		}
	}
}
