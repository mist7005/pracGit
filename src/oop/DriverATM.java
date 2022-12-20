package oop;
import java.util.Scanner;
public class DriverATM {

	public static void main(String[] args) {
		ICICI ob=new ICICI(1234567,1234,400000d);
		/*
		ob.accno=1234567;
		ob.pin=1234;
		ob.balance=400000d;
		*/
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("select your choice");
		System.out.println("1:Withdraw money "+"2:Check balance "+"3:Change Pin "+"4:Print Statement "+"5:Cancel h");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
		System.out.println("enter pin");
		int pin=sc.nextInt();
		ob.withdrawMoney(pin);
		break;
		}
		case 2:
		{
		System.out.println("enter pin");
		int pin=sc.nextInt();
		ob.checkBalance(pin);
		break;
		}
		case 3:
		{
		System.out.println("enter your current pin");
		int pin=sc.nextInt();
		ob.changePin(pin);
		break;
		}
		case 4:
		{
		System.out.println("enter pin");
		int pin=sc.nextInt();
		ob.printStatement(pin);
		break;
		}
		case 5:
		{
		System.out.println("thank you");	
		System.exit(0);
		}
		default:
		{
		System.out.println("invalid choice");	
		}
		}
		}
	}

}
