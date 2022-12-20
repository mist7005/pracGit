package trial;
import java.util.*;

public class Ts {

	public static void main(String[] args) {
		TreeSet<Integer> h=new TreeSet<Integer>();
		h.add(100);
		h.add(12);
		h.add(59);
		h.add(11);
		h.add(1);
		h.add(78);
		h.add(11);
		HashSet<Integer> g=new HashSet<Integer>(h);
		
		
		System.out.println(h.contains(100));
		
		for(Integer i:h)
		{
			System.out.println(i);
		}
		
		Iterator<Integer> p=h.iterator();
		while(p.hasNext()==true)
		{
			System.out.println(p.next());
		}
		TreeSet<String> h1=new TreeSet<String>();
		h1.add("hello");
		h1.add("hi");
		h1.add("1");
		h1.add("3");
		System.out.println(h1);
	}

}
