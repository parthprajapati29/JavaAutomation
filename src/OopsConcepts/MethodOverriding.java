package OopsConcepts;

class Vehicle{
	public void speed() {
		System.out.println("this speed method belong to vehicle class");
	}
}

class Bike extends Vehicle{
	public void speed() {
		System.out.println("this speed method belong to Bike class");
	}
}

class Car extends  Vehicle{
	public void speed() {
		System.out.println("this speed method belong to car class");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Car c = new Car();
		c.speed();
		
		//  
		Vehicle v = new Car();
		v.speed();
	}

}
