package labtest6;
import java.util.ArrayList;
public class ArrayColorsList {

	//main method....
		public static void main(String[] args) {
			//Calling method color array..
			colorarray();
			

		}
		
		//color array method ..
		public static void colorarray() {
			//Creating array list colors..
			ArrayList<String> colors=new ArrayList<>();
			
			//Adding elements into list..
			colors.add("Red");
			colors.add("Yellow");
			colors.add("Magenta");
			colors.add("Blue");
			
			System.out.println("Colors in the array list are:");
			
			//for each loop for iterating in array list...
			//and then printing the colors..
			for(String c: colors) {
				System.out.println(c);
			}
			
			
		}

	}
