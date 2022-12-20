package oop;

public class CurrentAccount extends Account {
String cType;

public CurrentAccount(long accno, String holderName, String ifsc, double balance, String cType) {
	super(accno, holderName, ifsc, balance);
	this.cType = cType;
}

	
}
