package data_structures.Maps_and_sets;

import java.util.HashMap;
import java.util.Map;

public class MapValues {
	public static void main(String[] args) {

		Map map = new HashMap();
		Map map1 = new HashMap();

		map1.put("hi", map.get("sdjf"));
		System.out.println(map1);

		System.out.println(checkIfContains("create_text"));
		System.out.println(checkIfContains("create_link"));
		System.out.println(checkIfContains("create_video"));
	}
	private static boolean checkIfContains(String str){
		if (str.matches("(?i)(.*)link|(.*)video|(.*)text")) {
			return true;
		}else {
			return false;
		}
	}

}
