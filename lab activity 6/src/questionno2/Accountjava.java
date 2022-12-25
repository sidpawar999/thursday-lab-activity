package questionno2;


import java.util.Scanner;

class InSufficientBalancedException extends Exception		
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InSufficientBalancedException(String string)
	
	{
		
	}	
}
public class Accountjava {
	float balance=0;
	float totalbalance=0;
	float amount;
	
	Scanner sc=new Scanner(System.in);
	
	public void deposite()
	{
		System.out.println("Enter the balance: ");	
		balance=sc.nextFloat();
		System.out.println("Deposite Money: ");
		amount=sc.nextFloat();				
		totalbalance=balance+amount;
		System.out.println("Total balance: " + totalbalance);		
	}
	
	public void withdraw() throws InSufficientBalancedException 
	{
		float withdraw;
		System.out.println("Withdraw amount: ");
		withdraw=sc.nextFloat();			
		if(totalbalance<withdraw)			
		{
			throw new InSufficientBalancedException("Not sufficient balance");
		}
		else {
			System.out.println("Withdraw successfull, collect your cash");
		}
			
	}

}

