package prac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class Al {

	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList <Object>();
		a.add("hi");
		a.add(12);
		a.add(12.34f);
		a.add(true);
		a.add('A');
		Iterator <Object> x=a.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		System.out.println("---------------");
		LinkedList <Object> b=new LinkedList <Object>(a);
		for(Object i:b)
		{
			System.out.println(i);
		}
		
		ArrayList<Object> a1=new ArrayList <Object>(b);
		ListIterator <Object> z=a1.listIterator();
		System.out.println("printing using list iterator");
		while(z.hasNext())
		{
			System.out.println(z.next());
		}
		while(z.hasPrevious())
		{
			System.out.println(z.previous());
		}
		
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(23);
		ob.add(54);
		ob.add(12);
		ob.add(1);
		System.out.println("sorting");
		Collections.sort(ob);
		System.out.println(ob);
		
		ArrayList<Integer> ob1=new ArrayList<Integer>(ob);
		System.out.println("reverse");
		Collections.reverse(ob1);
		System.out.println(ob1);
		
		
		
		

	}

}
