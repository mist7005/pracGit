package oop;

public class Student extends Person {
int id;
String stream;

void printStudent()
{
	System.out.println("STUDENT DETAILS: ");
System.out.println("ID: "+id);
System.out.println("Stream: "+stream);
System.out.println("Name: "+name);
System.out.println("Age: "+age);
System.out.println("--------------------------------------- ");
}
}
