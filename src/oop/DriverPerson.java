package oop;
public class DriverPerson {

	public static void main(String[] args) {
		Student s=new Student();
		s.age=25;
		s.name="abhi";
		s.id=121;
		s.stream="testing";
		s.printStudent();
		Trainer t=new Trainer();
		t.age=30;
		t.name="mist";
		t.sal=30000f;
		t.designation="java trainer";
		t.printTrainer();

	}

}
