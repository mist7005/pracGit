package trial;

import java.util.ArrayList;
import java.util.Iterator;


public class Al2 {

	public static void main(String[] args) {
		ArrayList<Object>a=new ArrayList<Object>();
		a.add(100);
		a.add("ramu");
		a.add(21.34f);
		a.add(12345678l);
		a.add('B');
		Iterator<Object> i=a.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
//		

//		System.out.println(i.next());
		
		for (int j = 0; j < a.size(); j++) {
			System.out.println(a.get(j));
		}

	}
}
