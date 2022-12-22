package oops;
public class Person {
	//Declaration 
	String Name;
	int Age;
	String Mob;
	//Default Constructor
	public Person(){
		System.out.println("Default Constructor.....");
		
	}
	//Parameterized Constructor
	public Person(String Name,int Age,String Mob) {
		this.Name=Name;
		this.Age=Age;
		this.Mob=Mob;
	}

}
