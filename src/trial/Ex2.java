package trial;

public class Ex2 {// non static
	 int a=2;
	
static void display()
{
int a =10;
//when we try to call non static global variables into a non static method 
//we should use < this > keyword(refers to current executing variable).
Ex2 b = new Ex2();
System.out.println(a*2);
}

	public static void main(String[] args) {
		Ex2 ob = new Ex2();
//when we try to call non static method into a static method 
//we should create an object with an object reference variable and
//using that << object reference variable.method name >> we can call it.
		ob.display();

	}

}
