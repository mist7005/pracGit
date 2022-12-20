package trial;
import java.util.*;
public class Hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String,Object> h=new HashMap<String,Object>();
		h.put("phno", 123456678l);
		h.put("Name", "alex");
		h.put("Loc", "btm");
		h.put("pincode", 560076l);
		h.putIfAbsent("fName", "camp");
		h.put("Name", "sam");
		h.put(null, "hello");
		h.put("email", null);
//		System.out.println(h.containsKey("Loc"));
//		System.out.println(h.containsValue("btm"));
//		System.out.println(h.remove("fName"));
//		System.out.println(h.get("pincode"));
//		System.out.println("Key set: "+h.keySet());
//		System.out.println("Values: "+h.values());
//		System.out.println("entry set: "+h.entrySet());
		System.out.println(h);
		Set s=h.entrySet();
		System.out.println("Set value: "+(s));
		Iterator <Object>i=s.iterator();
		int p=0;
		while(i.hasNext()==true)
		{
			System.out.println(p+"--"+i.next());
			p++;
		}
		i.next();
		ArrayList<Object> h11=new ArrayList<Object>(s);
		System.out.println("array list");
		System.out.println(h11);
		System.out.println("using for each loop");
		for(Object j:h11)
		{
			System.out.println(j);
		}
		System.out.println("foreach end");
		
		HashMap<Integer,Object> h1=new HashMap<Integer,Object>();
		h1.put(21, "hello");
		h1.put(11, "hello");
		h1.put(1, "hello");
		h1.put(12, "hello");
		h1.put(6, "hello");
		h1.put(5, "hello");
		System.out.println(h1);
	}
}
