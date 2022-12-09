package labtest1;
public class GreatestNumber {
	//Method for Greatest among 3 number
	public static int Greatest(int a, int b,int c) {
		if(a>b)
		{
			if(a>c) {
				return a;
			}
			else {
				return c;
			}
		}
		else if(b>c) {
			return b;
		}
		else
		{
			return c;
			
		}
	}

	public static void main(String[] args) {
		// Initializing the variable
		int a=20;
		int b=80;
		int c=60;
		System.out.printf("Greatest among three are :"+ Greatest(a,b,c));//Calling  method greatest
		

	}

}

