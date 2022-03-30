package com.assignment.two;

import com.assignment.one.class1;
import com.assignment.three.class2;

public class class3 {
	

	public byte barbie;
	private int teddy;
	protected String kitty;
	boolean panda;
	
	public static void main(String[] args) {
		
		class3 softToys = new class3 ();
		class2 connect = new class2();
		class1 contact = new class1();
		
		
 System.out.println("I love surprises and barbie too " + softToys.barbie);
 System.out.println("My fav soft toy is teddy " + softToys.teddy);
 System.out.println("I love eyes of kitty " + softToys.kitty);
 System.out.println("I like to have panda as a soft toy in my collection " + softToys.panda);
 
		
		// Checking for the visibility and non visibility from com.assignment.two package
 System.out.println("I am from class2 package 2" + connect.bugati);                 // Access modifier is public hence it is visible outside the package also
 System.out.println("I will not going to print on console window" + connect.mini); // Access modifier is protected 
 System.out.println("I m busy right now" + connect.limo);                         // access modifier is of private type which we can't access outside the package so it is invisible
 System.out.println("I will not appear any more" + connect.ferari);              // access modifier is of default type which is only accessible within the same package only.
		   
		
//Checking for the visibility and non visibility from com.assignment.one package
System.out.println("I like it very much" + food.manturian);          // Access Modifier is of public type so it is accessible outside the package also.
System.out.println("I will prefer soup in starter" + food.soup);    //Access Modifier is Protected
System.out.println("I am in love with noodles" + food.noodles);    // Access Modifier is of private type which we can't access outside the package
System.out.println("I like this dish of paneer" + food.paneer65); // Access Modifier is default that we can access within the same package only.

		

}
}
