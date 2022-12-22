package oops;

public class StudentMain {

	public static void main(String[] args) {
//		Declaring and initializing the array....
		String[] Subject= {"Java","OS","OOPS"};
		
//Instantiation of students
		Student s1=new Student("Riki",19,"99999999","1",Subject);
		Student s2=new Student("tiki",20,"99999988","2",Subject);

//Printing the students details
		System.out.println(s1);
		System.out.println(s2);
		

	}

}