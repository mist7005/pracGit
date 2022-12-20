package prac;

import java.util.Scanner;

public class LegalAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int x=sc.nextInt();
		try {
		checkAge(x);
		}
		catch(Cexceptn e)
		{
			System.out.println(e);
			System.out.println("handled");
		}
		System.out.println("the end");
		

	}
	public static void checkAge(int x)
	{
		if(x<18)
		{
			throw new Cexceptn("not eligible");
		}
		else
			System.out.println("eligible");
	}

}
