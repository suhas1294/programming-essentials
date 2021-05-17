package regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseRGBStringToHex {
	public static void main(String args[]){
		//String regex = "(.)*([a-z]{3,3}[(](([0-9]{1,3}), ([0-9]{1,3}), ([0-9]{1,3}))[)])(.)*";
		String regex = "([a-z{3,3}(()])*(([0-9]{1,3}), ([0-9]{1,3}), ([0-9]{1,3}))(.)*";
		String script = "rgb(65, 182, 73) none repeat scroll 0% 0% / auto padding-box border-box";
		String color = "";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(script);
		if (m.find()) {
			color = m.group(2);
			color = color.replace(" ", "");
			//System.out.println("FOUND : " + m.group(2));
			System.out.println(color);
		}
		String[] col = color.split(",");
		int[] array = Arrays.stream(col).mapToInt(Integer::parseInt).toArray();
		System.out.println(array);
		String hex = String.format("#%02x%02x%02x", array[0], array[1], array[2]);
		System.out.println(hex);
	}
}
