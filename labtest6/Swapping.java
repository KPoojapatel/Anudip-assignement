package labtest6;

import java.util.ArrayList;
import java.util.Collections;

public class Swapping {
	//main method..
	public static void main(String[] args) {
		//calling swapping method..
		swapping();
		
	}
	
	//swapping method..
	public static void swapping() {
		///creating two array list...
		ArrayList<Integer> num1=new ArrayList<>();
		ArrayList<Integer> num2=new ArrayList<>();
		//adding elements in num1 and num2..
		num1.add(18);
		num1.add(27);
		num1.add(36);
		num1.add(45);
		num2.add(54);
		num2.add(63);
		num2.add(72);
		num2.add(81);
		System.out.println("Before Swapping num1 is:");
	//for each loop to print elements before swapping..
		for(Integer n: num1) {
			System.out.println(n);
		}
		
		//using swap method from collections class....
		Collections.swap(num1,2,3);
		
		//for each loop to print elements after swapping..
		System.out.println("After Swapping index 2 and 3 , num1 is:");
		for(Integer n: num1) {
			System.out.println(n);
		}
		//for each loop to print elements before swapping..
		System.out.println("Before Swapping num2 is:");
		for(Integer n: num2) {
			System.out.println(n);
		}
		//calling swap method from collections class..
		Collections.swap(num2,3,2);
		
		//for each loop to print elements after swapping..
		System.out.println("After Swapping index 2 and 3 , num2 is:");
		for(Integer n: num2) {
			System.out.println(n);
		}
	}

}
