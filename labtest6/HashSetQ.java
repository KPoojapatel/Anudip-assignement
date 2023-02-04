package labtest6;

import java.util.HashSet;

public class HashSetQ {
	//main Method..
	public static void main(String[] args) {
		//calling number of elements method....
		numberofelements();
		
	}
	
	//number of elements method....
	public static void numberofelements(){
		//creating Hash set...
		HashSet<Integer>h=new HashSet<>();
		//adding element in hash set...
		h.add(66);
		h.add(77);
		h.add(55);
		h.add(44);

		
		System.out.println("NO of element present in hashset is:"+h.size());
		
	}


}
