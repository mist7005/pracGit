package prac;

public class EOProp {

	public static void main(String[] args) {
		try {
		check();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}

	}
	static void check()
	{
		System.out.println(20/0);
	}

}
