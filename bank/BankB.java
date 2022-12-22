package bank;
//BankB is a class which implements the Bank Interface...
public class BankB implements Bank{
	
	//Declaration...
	int rs;
	
	//Parameterized constructor of BankB
	public BankB(int rs) {
		this.rs=rs;
	}
	@Override
	public int getBalance() {
		
		return rs;
		
		
	}

}

