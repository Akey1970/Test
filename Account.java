package runnable;

public class Account {
	
	
	private int bal;
	
	public Account(int bal)
	{
		
		this.bal=bal;
	}
	
	public boolean isinsufficient_balance(int w) {
		
		if(bal>w)
			return true;
		else
			return false;
		
		
	}
	
	public void withdraw(int amt) {
		
		bal=bal-amt;
		
		System.out.println("�our withdraw amount is"+amt);
		System.out.println("�our balance amount is"+bal);
		
		}
}
