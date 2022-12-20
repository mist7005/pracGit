package trial;

public class DriverX {

	public static void main(String[] args) {
//		Y y=new Y();
//		Z z=new Z();
//		
//		y.m();
//		y.n();
//		
//		z.m();
//		z.s();
		
		X ob =new Y();
		X obj=new Z();
		
//		ob.m();
//		obj.m();
		
		Y c=(Y)ob;
		Z c1=(Z)obj;
		
		c.m();
		c.n();
		System.out.println("------------------");
		c1.m();
		c1.s();
		
		
		
		
		
	

	}

}

