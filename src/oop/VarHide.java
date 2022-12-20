package oop;

class A
{
	int s=1234;
}

class B extends A
{
	int s=6789;
	void printValue()
	{
		float s=999.2f;
		System.out.println(s+" local variable");
		System.out.println(this.s+" global variable of same class"); //variable shadowing
		System.out.println(super.s+" global variable of parent class" ); //variable hiding
	}
}

public class VarHide {

	public static void main(String[] args) {
		B ob =new B();
		ob.printValue();

	}

}
