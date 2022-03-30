package com.assignment2;

public class assign6 {

	public static void main(String[] args) {
     
		assign6 dinner = new assign6(); // dinner is object created to access non static method
		
		dinner.paneer(10);
		dinner.roti(2);
		
	}

	//instance method with int return type and one int parameter
	public int roti(int tandoori) {
		System.out.println("I can eat " + tandoori + " roti at a time");
		return 7;
	}
	
	//instance method with int return type and one int parameter
    private int paneer(int chilly) {
    	System.out.println("I want Paneer chilly in starter of " + chilly + " pieces");
    	return 10;
    }
    
    
	
}
