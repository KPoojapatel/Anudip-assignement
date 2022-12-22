package oops;
import java.util.Arrays;

public class Student extends Person {
	//Declaration
	static final String institute="UCER";
	String RollNo;
	String[] Subject;
	
	//Default constructor..
	public Student() {
		System.out.println("Default constructor......");
	}
	//Parameterized constructor..
	public Student(String Name,int Age,String Mob,String RollNo,String[] Subject) {
		super(Name,Age,Mob);
		this.RollNo=RollNo;
		this.Subject=Subject;
	}
	
	@Override
	public String toString() {
		System.out.println("Institute: "+institute);
		return "Student [RollNo=" + RollNo + ", Subject=" + Arrays.toString(Subject) + ", Name=" + Name + ", Age=" + Age
				+ ", Mob=" + Mob + "]";
	}

}