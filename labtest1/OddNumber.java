package labtest1;
public class OddNumber {
	// method for printing the odd number
	public static void isodd() {
		for(int i=1;i<=20;i++) {
			if((i%2)!=0) {
			System.out.println(i);
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("So the odd number between 1 to 20 are:");
		//Calling the method 
		isodd();
		

	}


}

