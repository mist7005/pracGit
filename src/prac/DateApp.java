package prac;
import java.util.Scanner;
public class DateApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		try {
			checkAge(age);
		}
		catch(CustomEx1 e)
		{
			e.printStackTrace();
		}
		
		}
	public static void checkAge(int a) {
			if(a<21)
				throw new CustomEx1("not eligible");
			else
				System.out.println("eligible");
		
		}
	}

	


