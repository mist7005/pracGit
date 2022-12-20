package prac;

import java.util.Scanner;

public class ExHandling {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the size of array");
		int x=sc.nextInt();
		int ar[]=new int[x];
		System.out.println("enter "+x+"elements");
		for(int i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("the elemnts before dividing:");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("enter the number you want to divide the elemnts");
		int num=sc.nextInt();
		try {
			for(int i=0;i<ar.length;i++)
			{
				ar[i]=ar[i]/num;
			}
			System.out.println("the elemnts after dividing");
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
			}
			System.out.println("enter the number you want to access the elemnts");
			int num1=sc.nextInt();
			System.out.println("the elemt u requested: "+ar[num1]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		

	}

}
