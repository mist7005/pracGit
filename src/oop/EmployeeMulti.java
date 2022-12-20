package oop;

public class EmployeeMulti extends PersonMulti{
	int id;
	double salary;

	void printEmployee()
	{
	printPersonMulti();
	System.out.println("ID: "+id);
	System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		System.out.println("child");
	}
}
