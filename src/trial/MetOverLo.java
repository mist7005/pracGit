package trial;

public class MetOverLo {
	static String name="milon";//
	
	 void add(int a,int b,int c,int d)
	{
		System.out.println("addition of 4 numbers");
		System.out.println(a+b+c+d);
		
	}
	  void add(int a,int b,int c)
	 {
		 System.out.println("addition of 3 numbers");
		 System.out.println(a+b+c);
	 }
	  void add(int a,int b)
	 {
		 System.out.println("addition of 2 numbers");
		 System.out.println(a+b);
	 }
	

	public static void main(String[] args) {
		MetOverLo ob = new MetOverLo();//
		ob.add(20,30);
		ob.add(10,20,30);
		ob.add(10,30,10,2);
		System.out.println(MetOverLo.name);

	}

}
