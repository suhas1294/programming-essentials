package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// program to extract uuid from a string
public class contentId {
	public static void main(String[] args) {
		String contentId = "";
		String snapId = "fwx-dashboard-content-snap-title-flow-0eb69570-ceda-11e9-a278-9600002bf2b7";
		String regex = "(.)*(([a-zA-Z0-9]{8,8})-([a-zA-Z0-9]{4,4})-([a-zA-Z0-9]{4,4})-([a-zA-Z0-9]{4,4})-([a-zA-Z0-9]{12,12}))(.)*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(snapId);
		if (m.matches()) {
			contentId = m.group(2);
			System.out.println(contentId);
		}
		else {
			System.out.println("No UUID could be mapped");
		}
	}
}
