package oop;
import java.util.ArrayList;
public class ALstring {

	public static void main(String[] args) {
		ArrayList <String> a=new ArrayList<String>();
		a.add("chopra");
		a.add("prem");
		a.add("ram");
		a.add("laxman");
		a.add(4,"golu");
		for(String i:a)
		{
			System.out.print(i+"  ");
		}
		System.out.println();
		

	}

}
