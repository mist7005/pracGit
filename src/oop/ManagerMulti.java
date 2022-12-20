package oop;

public class ManagerMulti extends EmployeeMulti {
	String dname;
	void printManager()
	{
		printEmployee();
		System.out.println("Department name: "+ dname);
	}
	public static void main(String[] args) {
		ManagerMulti m=new ManagerMulti();
		m.name="mohan";
		m.age=45;
		m.id=2345;
		m.salary=45000d;
		m.dname="testing";
		m.printManager();
		System.out.println("child child");

	}
}
