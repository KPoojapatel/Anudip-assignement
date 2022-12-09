package labtest1;
import java.util.Scanner;  

public class Operation{
//	Method for performing arithmetic operations
	public static int operation(char n,int a,int b){
		int ans=0;
		switch(n) {
		case '+': ans=a+b;
					break;
		case '-': ans=a-b;
					break;
					
		case '*': ans=a*b;
					break;
		case '/': ans=a/b;
					break;
		case '%': ans=a%b;
					break;
		
		default: System.out.println("Please choose valid operations");

					
		
		}
		return ans;
		
		
	}
	public static void main(String[] args) {
		// Taking input from users
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter operation like *,%,/,+,- :");  
		char n = sc.next().charAt(0);
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();  
		

//Calling the method 
		int result=operation(n,a,b);
		System.out.println(result);
		
		

	}

}


