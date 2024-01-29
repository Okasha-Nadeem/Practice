package yuyuu;

class Vehicle{
	
	public void start() {
		System.out.println("I am Starting");
	}
	public void stop() {
		System.out.println("I am stopping");
	}
}

class car extends Vehicle{
	public void fourTires() {
		System.out.println("I have four tires");
	}
	
	public void color() {
		System.out.println("My color is Red");
	}
}
	
	
	class Bike extends Vehicle{
		public void twotires() {
			System.out.println("I have two tires");
			
		}
		public void color() {
			System.out.println("My color is Blue");
		}
	}
	

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v = new Vehicle();
		car c = new car();
		System.out.println("______CARS____");
		c.fourTires();
		c.color();
		c.start();
		c.stop();
		
		System.out.println("________BIKE______________");
		Bike b = new Bike();
		b.twotires();
		b.color();
		
		
		
		
	}

}
