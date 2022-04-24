package com.inheritance;

public class Vehicle {

	public void speed() {
		System.out.println("I am from vehicle class");
	}
}
class car extends Vehicle{
	public void speed() {
		System.out.println("I am from Car class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car a = new car();
		a.speed();
			
	}

}
