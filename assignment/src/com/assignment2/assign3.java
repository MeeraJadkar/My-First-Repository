package com.assignment2;

public class assign3 {

	public static void main(String[] args) {

		// Static method doesn't require creation of object
	   // we can also call static method with object but it is not the recommended way
		
		Butterfly();      // static method can be called directly
		assign3.Lion();  // static method can also be called with class name
		
	}
	
	   // static method without return type and no parameter ------> default - access modifier
	static void Butterfly() {
		System.out.println("I love to fly very high in the sky");
	}
	
	
	   // static method without return type and no parameter ------> protected - access modifier
	protected static void Lion() {
		System.out.println("I am the king of my own kingdom");
	}

}
