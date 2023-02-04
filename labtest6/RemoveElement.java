package labtest6;

import java.util.ArrayList;

public class RemoveElement {

	
	//main method....
	public static void main(String[] args) {
		//Calling method color array..
		Remove();
		

	}
	
	//color array method ..
	public static void Remove() {
		//Creating array list colors..
		ArrayList<String> colors=new ArrayList<>();
		
		//Adding elements into list..
		colors.add("Red");
		colors.add("blue");
		colors.add("green");
		colors.add("pink");
		
		System.out.println("array list before removal of 3rd element:");
		
		//for each loop for iterating in array list...
		//and then printing the colors..
		for(String c: colors) {
			System.out.println(c);
		}
		
		//remove used to remove the element from array list.
		colors.remove(3);
		System.out.println("array list after removal of 3rd element:");
		for(String c: colors) {
			System.out.println(c);
		}
		
		
	}
	
	

}
