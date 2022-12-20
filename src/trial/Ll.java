package trial;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;
public class Ll {

	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(100);
		ll.add(200);
		ll.add("btm");
		ll.add(12.34f);
		ll.add(true);
		ll.add(50);
		ll.add("java");
		ll.add(2,"jpnagar");
	ll.remove();
		
		Iterator <Object> i=ll.iterator();
		int a=0;
		System.out.println("Iterator");
		while(i.hasNext()==true)
		{
			System.out.print(a+" ");
			a++;
			System.out.println(i.next());
		}
		System.out.println("-------------------");
		ListIterator <Object> b=ll.listIterator();
		System.out.println("ListIterator");
		System.out.println("iterating forward direction");
		System.out.println("----------");
		while(b.hasNext()==true)
		{
			System.out.println(b.next());
		}
		System.out.println("------");
		System.out.println("forward ends");
		System.out.println("----------------");
		System.out.println("interating backward direction");
		System.out.println("----------");
		while(b.hasPrevious()==true)
		{
			System.out.println(b.previous());
		}
		System.out.println("----");
		System.out.println("backward ends");
		

	}

}
