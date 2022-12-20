package oop;

public class SavingAccount extends Account {
String sType;

public SavingAccount(long accno, String holderName, String ifsc, double balance,String sType) {
	super(accno, holderName, ifsc, balance);
	this.sType=sType;
}


}
