package trial;

public class Student1 extends Person {
	
	int id;
	String branch;
	
	Student1(String name,String address,int id,String branch)
	{
		super(name,address);
		this.id=id;
		this.branch=branch;
	}
	
	Student1(String name,String address,int id)
	{
		super(name,address);
		this.id=id;
	}
	
	Student1(String name,String address)
	{
		super(name,address);
	}
	Student1(String name)
	{
		super(name);
	}
	
	void disStudent1()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(id);
		System.out.println(branch);
	}
	public static void main(String[] args) {
		Student1 s=new Student1("abhishek","btm");
		Student1 s1=new Student1("abhishek");
		s.disStudent1();
	}

}
