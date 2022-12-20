package oop;
import java.util.ArrayList;
public class AL {

	public static void main(String[] args) {
		ArrayList <Object> a=new ArrayList<Object>();
		a.add(100);
		a.add("hello");
		a.add(30.33f);
		a.add(123456789l);
		a.add('A');
		a.add(234);
		a.add(1,"good");
		System.out.println(a);
		for(Object i:a )
		{
			System.out.println(i);
		}
		
		

	}

}
