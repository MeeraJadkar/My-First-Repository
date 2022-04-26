package com.Practice.ObjectCreation;

public class Class1 {
	
	int var1;
// class doesn't exist in real time.
// hence to access anything from class body we need to create object inside the main method.
// after creating object inside the main method we can execute class contain. 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Class1 obj = new Class1(); // new is reserved word
		System.out.println("The value of var1 is "+ obj.var1);
		
// object name should be unique if it is duplicate then it will give error.
		
}
}
