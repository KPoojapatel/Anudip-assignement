package classes;
//MemberMain class 
public class MemberMain {
	public static void main(String []args) {
		
		//instantiating
		Address add1=new Address(208,"kanpur","UP");
		Address add2=new Address(203,"nagpur","UP");
		Employee e1=new Employee("Riki",1,"99999999",add1,100000,"software Engineers");
		Manager m1=new Manager("tiki",2,"9999988",add2,100000,"IT department");
		
		//calling method
		e1.print();
		m1.print();
		
	}
	

}
