package core_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String args[]){
		List<Integer> values = new ArrayList<>();
		values.add(3);
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(7);
		values.add(8);
		
		Iterator iterator = values.iterator();
		while (iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}
