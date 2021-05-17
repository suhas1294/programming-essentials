package data_structures.Maps_and_sets;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SetContains {
		public static void main(String[] args) {
				Set set = new HashSet();
				//set.add("hello");
				//set.add("world");
				System.out.println(set.size());
				System.out.println(set.contains("hello"));

				Map map = new HashMap();
				System.out.println(map.get("text"));
		}
}
