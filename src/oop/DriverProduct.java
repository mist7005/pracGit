package oop;

public class DriverProduct {

	public static void main(String[] args) {
		SkinCare s1=new SkinCare();
		s1.category="liner";
		s1.brand="w";
		s1.price=2300f;
		SkinCare s2=new SkinCare();
		s2.category="faceserum";
		s2.brand="w";
		s2.price=3300f;
		SkinCare s3=new SkinCare();
		s3.category="lotion";
		s3.brand="w";
		s3.price=4300f;
		SkinCare s4=new SkinCare();
		s4.category="cream";
		s4.brand="w";
		s4.price=5300f;
		s1.displayProduct();
		s1.displaySkinCare();
		System.out.println("----------------------");
		s2.displayProduct();
		s2.displaySkinCare();
		System.out.println("----------------------");
		s3.displayProduct();
		s3.displaySkinCare();
		System.out.println("----------------------");
		s4.displayProduct();
		s4.displaySkinCare();
		System.out.println("----------------------");
		
		HairCare h1=new HairCare();
		h1.category="hairSerum";
		h1.brand="y";
		h1.price=300f;
		HairCare h2=new HairCare();
		h2.category="shampoo";
		h2.brand="y";
		h2.price=200f;
		HairCare h3=new HairCare();
		h3.category="hairCream";
		h3.brand="z";
		h3.price=400f;
		h1.displayProduct();
		h1.displayHairCare();
		System.out.println("-----------------------");
		h2.displayProduct();
		h2.displayHairCare();
		System.out.println("-----------------------");
		h3.displayProduct();
		h3.displayHairCare();
		System.out.println("-----------------------");
		

	}

}
