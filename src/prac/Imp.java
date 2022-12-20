package prac;
import java.util.ArrayList;
import java.util.Iterator;
public class Imp {

	public static void main(String[] args) {
//		Student ob=new Student("raj",12,"btm");
//		System.out.println(ob);
		ArrayList<Student> hm=new ArrayList<Student>();
		hm.add(new Student("raj",12,"btm"));
		hm.add(new Student("sahul",15,"jp nagar"));
		hm.add(new Student("gahul",17,"jaynagar"));
		hm.add(new Student("yal",16,"nagar"));
		System.out.println("printing directly");
		System.out.println(hm);
		System.out.println("------------");
		System.out.println("printing usinf for each loop");
		for(Student i:hm)
		{
			System.out.println(i.name+" "+i.age+" "+i.loc);
		}
		System.out.println("---------------");
		System.out.println("using iterator");
		Iterator<Student> x=hm.iterator();
		while(x.hasNext())
		{
			System.out.println(x.next());
		}
		

	}

}
