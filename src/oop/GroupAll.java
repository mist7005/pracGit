package oop;
import java.util.ArrayList;
public class GroupAll {

	public static void main(String[] args) {
		ArrayList <Object> a=new ArrayList <Object>();
		a.add(new Emp("E1234","raju"));
		a.add(new Emp("E1134","virat"));
		a.add(new Emp("E2234","sahil"));
		a.add(new Emp("E3234","ram"));
		a.add(new Stu(1,"shyam"));
		a.add(new Stu(2,"collin"));
		a.add(new Perso(26,"madhu"));
		a.add(new Perso(35,"ragdhu"));
		
		ArrayList <Object> b=new ArrayList <Object>();
		b.add("India");
		b.add("btm");
		b.addAll(a);
		
		
		for(Object i:a)
		{
			System.out.println(i);
		}
		System.out.println("printing using get method: "+a.get(2));
		System.out.println("----------------------");
		System.out.println(b);
		System.out.println("index of btm is: "+b.indexOf("btm"));
	}

}
