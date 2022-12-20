package oop;

public class Emp {
	String empId;
	String eName;
	
	Emp(String empId,String eName)
	{
		this.empId=empId;
		this.eName=eName;
	}

	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", eName=" + eName + "]";
	}
	

}
