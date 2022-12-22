package bank;
//BankA is a class which implements the Bank Interface...
public class BankA implements Bank {
	
	//Declaration...
	int rs;
	
	//Parameterized constructor of BankA
	public BankA(int rs) {
		this.rs=rs;
	}

	@Override
	public int getBalance() {
		return rs;
		
		
	}

}