import java.util.Scanner;

public class BankingApplication {

	public static void main(String[] args) {
		
	}

}

class BankAccount
{
	int balance;
	int previousTransaction;
	String customerName;
	String customerId;
	
	BankAccount(String cname,String cid){
		customerName = cname;
		customerId = cid;
	}
	
	void deposite(int amount)
	{
		if(amount > 0)
		{
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	
	void withdraw(int amount) 
	{
		if(amount != 0)
		{
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}
	
	void getPreviousTransaction()
	{
		if(previousTransaction > 0) {
			System.out.println("Deposited : "+previousTransaction);
		}
		else if(previousTransaction < 0)
		{
			System.out.println("Withdraw : "+ Math.abs(previousTransaction));
		}
		else
		{
			System.out.println("No transaction Occured");
		}
	}
	
	void showMenu()
	{
		char option='\0';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome "+customerName);
		System.out.println("Your ID is ");
	}
	
}
