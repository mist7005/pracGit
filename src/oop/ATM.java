package oop;

import java.util.Scanner;

public abstract class ATM {
	static String companyInCharge="CISCO";
	abstract void withdrawMoney(int psd);
	abstract void checkBalance(int psd); 
	abstract void changePin(int psd);
	abstract void printStatement(int psd);

}
class ICICI extends ATM {
	long accno;
	int pin;
	double balance;
	
	ICICI(long accno,int pin,double balance)
	{
		this.accno=accno;
		this.pin=pin;
		this.balance=balance;
	}
	
	void withdrawMoney(int psd)
	{
		if(psd==pin)
		{
			System.out.println("enter amount");
			Scanner sc=new Scanner(System.in);
			double amount=sc.nextDouble();
			balance=balance-amount;
					
		}
		else
		{
			System.out.println("invalid pin");
		}
	}
	void checkBalance(int psd)
	{
		if(pin==psd)
		{
			System.out.println("the account balance is: "+balance);
		}
		else
			System.out.println("invalid pin");
	}
	
	void changePin(int psd)
	{
		if(pin==psd)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("enter new pin");
			this.pin=sc.nextInt();
			System.out.println("your pin has been updated");
			
		}
		else
			System.out.println("inavlid pin");
	}
	void printStatement(int psd)
	{
		if(psd==pin)
		{
			System.out.println("account balance is: "+balance);
		}
		else
			System.out.println("invalid pin");
		
	}
}
