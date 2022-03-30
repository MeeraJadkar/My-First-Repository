package com.assignment.one;

import com.assignment.three.class2; // imported package three inside package one
import com.assignment.two.class3; // imported package two inside package one

   public class class1 {
    	
	public int manturian;  
	private float noodles;     
	protected boolean soup;     
	double paneer65;         

	// JDK will start executing the code from main method 
	public static void main(String[] args) {       

   class1 chinese = new class1(); // This object is created to access all the variables declared outside the method
   class2 call = new class2(); // this object is created to import the second package inside the first
   class3 communicate = new class3(); // this is object created to import the third package inside the first
   System.out.println(chinese);
   // we are calling declared variable in the same package with chinese object name.
 System.out.println("I like to eat manturian" + chinese.manturian);
 System.out.println("I like to eat noodles" + chinese.noodles);
 System.out.println("I like hot soup" + chinese.soup);
 System.out.println("I love paneer65 in starter" + chinese.paneer65);
   
   
   // Checking for the visibility and non visibility from com.assignment.two package
 System.out.println("I am from class2 package 2" + call.bugati);                 // Access modifier is public hence it is visible outside the package also
  System.out.println("I will not going to print on console window" + call.mini); // Access modifier is protected 
  System.out.println("I m busy right now" + call.limo);                         // access modifier is of private type which we can't access outside the package so it is invisible
 System.out.println("I will not appear any more" + call.ferari);              // access modifier is of default type which is only accessible within the same package only.
   
   
   // Checking for the visibility and non visibility from com.assignment.three package
   System.out.println("I want it right now " + communicate.barbie);               // access modifier is public hence it is visible outside the package also
  System.out.println("I am not going to fly" + communicate.teddy);              // access modifier is of private type which we can't access outside the package so it is invisible
  System.out.println("I will play with you all the time" + communicate.panda); // access modifier is default that we can access within the same package only 
  System.out.println("Your eyes are so cute kitty" + communicate.kitty);      // access modifier is of protected type 
   
      
}
}
