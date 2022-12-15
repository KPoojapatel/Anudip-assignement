package classes;
//Employee class which inherit member class
public class Employee extends Member{
private String specialization;

//Parameterized constructor 

public Employee (String name,int age,String phoneNumber,Address address,int salary,String specialization)
{
	super(name,age,phoneNumber,address,salary);
	
	this.specialization=specialization;
	System.out.println("specialization:" +this.specialization);

}

}