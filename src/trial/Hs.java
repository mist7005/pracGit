package trial;
import java.util.HashSet;
import java.util.*;
public class Hs {

	public static void main(String[] args) {
		HashSet<Integer> h=new HashSet<Integer>();
		h.add(100);
		h.add(12);
		h.add(59);
		h.add(11);
		h.add(1);
		h.add(78);
		h.add(100);
		
		TreeSet<Integer> g=new TreeSet<Integer>(h);
		
		System.out.println("printing using for each");
		for(Integer i:h)
		{
			System.out.println(i);
		}
		
		Iterator <Integer> p=h.iterator();
		Iterator <Integer> m=g.iterator();
		
		while(p.hasNext()==true)
		{
			System.out.println(p.next());
		}
		
		while(m.hasNext()==true)
		{
			System.out.println(m.next());
		}

	}

}
