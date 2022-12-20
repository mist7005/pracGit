package oop;

public class Mango extends Fruit {
String origin;



public Mango(String color, float price,String origin) {
	super(color, price);
	this.origin=origin;
	// TODO Auto-generated constructor stub
}



void displayMango()
{
System.out.println("mango origin is: "+origin);	
}

}
