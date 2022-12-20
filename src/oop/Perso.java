package oop;

public class Perso {
	int age;
	String name;
	Perso(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Perso [age=" + age + ", name=" + name + "]";
	}
	

}
