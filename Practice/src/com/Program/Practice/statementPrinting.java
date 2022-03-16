package com.Program.Practice;

public class statementPrinting {

	
	public void M1() {
		System.out.println("This is statement 1");
	}
	
	void M2() {
		System.out.println("This is statement 2");
	}
	
	public static void M3() {
		System.out.println("This is statement 3");
	}
	public static void main(String[] args) {

		statementPrinting obj = new statementPrinting();
		obj.M1();
		obj.M2();
		M3();
	}

}
