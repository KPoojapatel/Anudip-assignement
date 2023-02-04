package labtest6;

import java.util.HashMap;
import java.util.Map;

public class MapQ {
	//main method..
	public static void main(String args[]) {
//		calling count Method...
		count();
		
	}
	public static void count() {
		//Creating Map..
		Map<Integer,String> hm=new HashMap<>();
		//adding element..
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(4, "four");
		hm.put(5, "five");
		//printing size/count of key-value pair in map... 
		System.out.println("Total key-value pair is:"+hm.size());
	}

}
