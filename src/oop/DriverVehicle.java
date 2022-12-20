package oop;

public class DriverVehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob =new Car();
		ob.type="diesel";
		ob.cc="800";
		ob.wheels="4";
		ob.brand="tata";
		ob.price=500000.00d;
		ob.color="red";
		
		
		ob.printCar();
		
		Bike b =new Bike();
		b.brakingSystem="abs";
		b.headLight="Led";
		b.cc="900";
		b.wheels="2";
		b.brand="kawasaki";
		b.price=200000.00d;
		b.color="blue";
		
		
		b.printBike();
		
	}

}
