package lambdas;

import java.util.ArrayList;
import java.util.List;

interface Cook{
	public void cooking(String ingredient);
}

public class Demo1 {
	public static void main(String[] args) {
		Cook cook = (String ing) -> {
			System.out.println("cooking rice");
		};
		cook.cooking("sambar");
		
		List<String> list=new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		
		list.forEach((n) -> {
			System.out.println(n);
		});
	}
}
