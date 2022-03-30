package com.assignment2;

public class assign4 {

	public static void main(String[] args) {

		assign4 wealth = new assign4();
		
		wealth.money(20);
	    wealth.payment(100);
	 
	}

	// instance method without return type and with int parameter
	public void payment(int a) {
		System.out.println("I will pay you this much only Rs. " + a);
	}
	
	// instance method without return type and with int parameter
	private void money(int b) {
		System.out.println("I can donate daily RS. " +b +" for handicapped people");
	}

}
