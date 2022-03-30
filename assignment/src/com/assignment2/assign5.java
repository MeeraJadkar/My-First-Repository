package com.assignment2;

public class assign5 {

	public static void main(String[] args) {

		Percentage(90.50f);
		assign5.weight(150.50f);
		
	}
	
	// static method without return type and one floating parameter
	public static void Percentage(float marks) {
		System.out.println("In my 10th class I have secured " + marks +"%");
	}
	

	// static method without return type and one floating parameter
    protected static void weight(float cheese) {
    	System.out.println("I want to buy mozzarella cheese of " + cheese + " grams");
	

}
}