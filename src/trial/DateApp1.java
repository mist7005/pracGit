package trial;

import java.util.Scanner;

public class DateApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		try {
		checkAge(age);
		}
		catch(MyException1 e)
		{
		e.printStackTrace();
		}
		finally {
		System.out.println("hello");
	}
	}
	static void checkAge(int a)
	{
		if(a<21)
			throw new MyException1("not eligible");
		else
			System.out.println("eligible");
	}

	

}
