package prac;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
public class Hset {

	public static void main(String[] args) {
//		HASH SET
		
		HashSet<Object> hs=new HashSet<Object>();
		hs.add(12);
		hs.add("hello");
		hs.add('A');
		hs.add(true);
		hs.add("hello");
		System.out.println(hs);
		
//		USING FOR EACH LOOP
		for(Object i:hs)
			System.out.println(i);
		
//		USING ITERATOR
		Iterator <Object> x=hs.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		
//	TREE SET
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(12);
		ts.add(1);
		ts.add(67);
		ts.add(56);
		System.out.println(ts.contains(67));
		System.out.println(ts);
//		USING FOR EACH LOOP
		for(Object j:hs)
			System.out.println(j);
		
//		USING ITERATOR
		Iterator <Object> y=hs.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}

	}

}
