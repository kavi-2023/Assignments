package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		
		System.out.println("Axis Bank Deposit limit: 100000");
		
		//super.deposit();
	}
	
	public static void main(String[] args) {
		
		BankInfo b=new AxisBank();
		b.deposit();
	}

}
