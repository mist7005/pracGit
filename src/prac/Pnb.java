package prac;
import java.util.Scanner;
public class Pnb extends Rbi implements Atm {
	double balance;
	long accno;
	int pin;
	static {
		System.out.println("branch");
	}
	
	Pnb(double b,long a,int p)
	{
		balance=b;
		accno=a;
		pin=p;
	}
	
	 public void withDrawMoney(int pwd)
	 {
		 if(pwd==pin)
		 {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter amount to withdraw");
			 int amt=sc.nextInt();
			 balance=balance-amt;
		 }
		 else
		 {
			 System.out.println("invalid pin");
		 }
		 
	 }
	public void checkBalance(int pwd)
	 {
		if(pwd==pin)
		{
			System.out.println("balance is: "+balance);
		}
		else
		{
			System.out.println("invalid pin");
		}
		 
	 }
	 public void changePin(int pwd)
	 {
		 if(pwd==pin)
		 {
			 Scanner sc=new Scanner(System.in);
			 System.out.println("enter new pin");
			 int p=sc.nextInt();
			 this.pin=p;
			 System.out.println("pin changed succesfully");
		 }
		 {
			 System.out.println("invalid pin");
		 }
		 
	 }
	public void printStats(int pwd)
	 {
		if(pwd==pin)
		{
			System.out.println("accno is; "+accno);
			System.out.println("balance is: "+balance);
		}
		else
		{
			System.out.println("invalid pin");
		}
		 
	 }


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Pnb ob=new Pnb(5000d,12345678l,1234);
		
		while(true) {
		System.out.println("enter your choice: ");
		System.out.print("1-withdraw/ ");
		System.out.print("2-check bal/ ");
		System.out.print("3-change pin/ ");
		System.out.print("4-statement/ ");
		System.out.print("5-cancel");
		System.out.println("");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
		{
			
			System.out.println("enter your pin");
			int p=s.nextInt();
			ob.withDrawMoney(p);
			break;
		}
		case 2:{
			System.out.println("enter your pin");
			int p=s.nextInt();
			ob.checkBalance(p);
			break;
		}
		case 3:{
			System.out.println("enter your pin");
			int p=s.nextInt();
			ob.changePin(p);
			break;
		}
		case 4:{
			System.out.println("enter your pin");
			int p=s.nextInt();
			ob.printStats(p);
			break;
		}
		case 5:{
			System.out.println("thank you");
			System.exit(0);
		}
		}
	}
		
		
		
		

	}

}
