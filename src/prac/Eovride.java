package prac;

public class Eovride {
	String name;
	int age;
	
	Eovride(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Eovride [name=" + name + ", age=" + age + "]";
	}
	
	
	public boolean equals(Object a)
	{
		Eovride m=(Eovride)a;
		if(this.age==m.age)
		{
			return true;
		}
		else
			return false;
	}
	
	

	public static void main(String[] args) {
		Eovride ob=new Eovride("abhi",12);
		System.out.println(ob);
		Eovride ob1=new Eovride("abhi",12);
		System.out.println(ob1);
		System.out.println(ob.equals(ob1));
		

	}

}
