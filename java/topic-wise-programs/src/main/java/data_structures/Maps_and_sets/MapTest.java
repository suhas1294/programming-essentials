package data_structures.Maps_and_sets;

import java.util.HashMap;
import java.util.Map;

class A3{
	String val;

	public A3(String val){
		this.val = val;
	}

	public boolean equals(A3 object){
		return  val.equals(object.val);
	}

	public int hashCode(){
		return val.hashCode();
	}

	@Override
	public String toString() {
		return this.val;
	}
}
class MapTest{
	public static void main(String[] args) {
		Map<A3,A3> map = new HashMap<>();
		A3 a3 = new A3("3");
		map.put(a3,a3);
		System.out.println(map.get(a3));
		a3.val = "2";
		System.out.println(map.get(a3));
	}
}