package FileOps;

import org.apache.commons.lang3.RandomStringUtils;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class createDynamicHTMLFiles {
	public static void main(String args[]) throws IOException {
		List<String> pageNames = new ArrayList();
		Random random = new Random();
		String analyticsScript = "<script async src=\"https://www.googletagmanager.com/gtag/js?id=UA-142056452-1\"></script><script>window.dataLayer = window.dataLayer || [];function gtag(){dataLayer.push(arguments);}gtag('js', new Date());gtag('config', 'UA-142056452-1');</script>";
		String faviconLink = "<link rel=\"shortcut icon\" href=\"data:image/x-icon;,\" type=\"image/x-icon\">";

		// creating file names
		for (int i = 0; i < 100; i++) {
			String fileName = RandomStringUtils.randomAlphanumeric(6);
			pageNames.add(fileName);
		}

		for(String fname : pageNames){
			String linkTo = pageNames.get(random.nextInt(pageNames.size()));
			String aHref = "<a href='" + linkTo + ".html" + "'>link to" + linkTo + " </a>";
			String html = "<!DOCTYPE html><html><head><title></title>" + analyticsScript + faviconLink + "</head><body>" + aHref + "</body></html>";
			File file = new File("/home/johndoe/workspace/crawlLoadWebsite/" + fname + ".html");
			if (file.createNewFile())
			{
				FileWriter writer = new FileWriter(file);
				writer.write(html);
				writer.close();
				System.out.println("File is created!");
			} else {
				System.out.println("File already exists.");
			}
		}

		// creating index file
		try {
			File file = new File("/home/johndoe/workspace/crawlLoadWebsite/index.html");
			int pnames = 5;
			List<String> indexLinks = new ArrayList<>(pageNames.subList(0,pnames));
			String iLinks = "";
			for (String link : indexLinks){
				iLinks =  iLinks + "\n" + "<a href='" + link + ".html" + "'>link to " + link + " </a><br>";
			}
			String indexHtml = "<!DOCTYPE html><html><head><title></title>" + analyticsScript + faviconLink + "</head><body>" + iLinks + "</body></html>";
			FileWriter writer = new FileWriter(file);
			writer.write(indexHtml);
			writer.close();
			System.out.println("\nIndex File is created!");
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Error creating index file");
		}

	}
}
