package trial;
import java.util.ArrayList;
public class Al1 {

	public static void main(String[] args) {
		ArrayList<Object>a=new ArrayList<Object>();
		a.add(100);
		a.add("ramu");
		a.add(21.34f);
		a.add(12345678l);
		a.add('B');
		 System.out.println(a);
		 System.out.println(a.indexOf(100));
		 a.remove(0);
		 System.out.println(a.contains(100));
		 System.out.println(a.get(1));
		 
		 main();

	}
	public static void main() {
		System.out.println("hello");
		
	}

}
