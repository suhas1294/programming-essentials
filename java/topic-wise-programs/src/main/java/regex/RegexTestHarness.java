package regex;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexTestHarness {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		while (true) {

			Pattern pattern =
					Pattern.compile(scanner.nextLine());

			Matcher matcher =
					pattern.matcher(scanner.nextLine());

			boolean found = false;
			while (matcher.find()) {
				System.out.println(String.format("I found the text" +
								" \"%s\" starting at " +
								"index %d and ending at index %d.%n",
						matcher.group(),
						matcher.start(),
						matcher.end()));
				found = true;
			}
			if(!found){
				System.out.println("No match found.");
				System.exit(0);
			}
		}
	}
}