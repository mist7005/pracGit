package trial;

public class Ex1 {
	int a=20;

	public static void main(String[] args) {
		int b=10;
		//NOTE
		//when we try to call non static global variables into a static method
		//use the
		//object reference.
		Ex1 ob=new Ex1();
		System.out.println(ob.a+10);
		

	}

}
