package trial;

class MethodHid1
{
	static String name="ABHI";	
	
	static void display()
	{
	System.out.println("the name is: "+name);	
	}
}

public class MethodHid  extends MethodHid1
{
	static int age=25;
	static void display()
	{
		System.out.println("the age is: "+age);
	}
	
public static void main(String []args)
{
MethodHid1.display();

}
}




