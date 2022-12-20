package prac;

public class C extends B{
int age;
	C(int id,String name,int age)
	{
		super(id,name);
		this.age=age;
	}
	@Override
	public String toString() {
		return "C [age=" + age + ", name=" + name + ", id=" + id + "]";
	}
	
}
