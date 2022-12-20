package trial;

public class VarShadow {
	static int a=16;
	
	void display()
	{
		int a=2500;
		System.out.println(a);
	}

	public static void main(String[] args) {
		String a="BTM";
		VarShadow ob= new VarShadow();
		System.out.println(VarShadow.a);
		ob.display();
		System.out.println(a);

	}

}
