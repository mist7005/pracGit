package prac;

public class DrriverPriv {

	public static void main(String[] args) {
		EncDemo ob=new EncDemo();
		ob.setPin(1234);
		ob.setName("abhi");
		System.out.println(ob.getPin());
		System.out.println(ob.getName());

	}

}
