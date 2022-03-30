package com.assignment.three;

import com.assignment.one.class1;
import com.assignment.two.class3;

public class class2 {

	public char bugati;
	private long limo;
	protected short mini;
	float ferari;
	
	public static void main(String[] args) {
	
		class2 carName = new class2 ();
		class3 Toy = new class3();
		class1 food = new class1();
		
 System.out.println("My fav car is " + carName.bugati);
 System.out.println("I like to travel in limo " + carName.limo);
 System.out.println("I don't prefer to drive mini car" + carName.mini);
 System.out.println("ferari is my dream car " + carName.ferari);
		
 
		// Checking for the visibility and non visibility from com.assignment.three package
 System.out.println("I want it right now " + Toy.barbie);               // access modifier is public hence it is visible outside the package also
 System.out.println("I am not going to fly" + Toy.teddy);              // access modifier is of private type which we can't access outside the package so it is invisible
 System.out.println("I will play with you all the time" + Toy.panda); // access modifier is default that we can access within the same package only 
 System.out.println("Your eyes are so cute kitty" + Toy.kitty);      // access modifier is of protected type 
		   
 
	// Checking for the visibility and non visibility from com.assignment.one package
 System.out.println("I like it very much" + food.manturian);          // Access Modifier is of public type so it is accessible outside the package also.
 System.out.println("I will prefer soup in starter" + food.soup);    //Access Modifier is Protected
 System.out.println("I am in love with noodles" + food.noodles);    // Access Modifier is of private type which we can't access outside the package
 System.out.println("I like this dish of paneer" + food.paneer65); // Access Modifier is default that we can access within the same package only.
 
		      
		

	}

}
