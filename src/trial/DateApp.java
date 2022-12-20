package trial;
import java.util.Scanner;
public class DateApp {

	public static void main(String[] args) throws MyException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age: ");
		int age=sc.nextInt();
		try {
		checkAge(age);
		}
		catch(MyException e)
		{
		e.printStackTrace();
		}
		System.out.println("hello");
	}
	static void checkAge(int a) throws MyException
	{
		if(a<21)
			throw new MyException("not eligible");
		else
			System.out.println("eligible");
	}

}
