package labtest6;
import java.util.TreeSet;

public class TreeSetQ {
	//main method..
	public static void main(String[] args) {
		//calling iterator method..
		iterator();
		
	}
	//iterator method..
	public static void iterator() {
		//Creating Tree set;
		TreeSet<Integer>T=new TreeSet<>();
		
		//adding element...
		T.add(22);
		T.add(2);
		T.add(99);
		T.add(0);
		T.add(2);
		
		//for each loop for iteration and printing the element..
		for(Integer tree: T) {
			System.out.println(tree);
		}
	}
}
