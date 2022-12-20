package trial;

import java.util.HashMap;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Tm {

	public static void main(String[] args) {
		TreeMap<String,Object> h=new TreeMap<String,Object>();
		h.put("phno", 123456678l);
		h.put("Name", "alex");
		h.put("Loc", "btm");
		h.put("pincode", 560076l);
		h.putIfAbsent("fName", "camp");
		h.put("Name", "sam");
		h.put("adress", "jpnagar");
		h.putIfAbsent("alias", "samrat");
		System.out.println(h);
	Set s=h.entrySet();
//	USING FOR EACH LOOP
	System.out.println("using foreach");
		for(Object i:s)
		{
			System.out.println(i);
		}
		System.out.println("end");
		TreeMap<Integer,Object> h1=new TreeMap<Integer,Object>();
		h1.put(1, "hi");
		h1.put(4,"hello");
		h1.put(8,"hello");
		h1.put(11,"hello");
		h1.put(34,"hello");
		h1.put(3,"hello");
		System.out.println(h1);
		
		TreeMap<Object,Object> h2=new TreeMap<Object,Object>();
		h2.put(1, "hi");
//		h2.put("hello", "hello");
		h2.put(4,"hello");
		h2.put(8,null);
		h2.put(11,"hello");
		h2.put(34,"hello");
		h2.put(3,"hello");
		System.out.println(h2);
	
	}

}
