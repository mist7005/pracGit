package oop;

public class Fruit {
String color;
float price;

public Fruit(String color, float price) {
	super();
	this.color = color;
	this.price = price;
}

void displayFruit()
{
System.out.println("the color is: "+color);
System.out.println("the price is: "+price);
}
}
