package com.important.programs;

// Swapping of 2 no. by taking input from user.
import java.util.Scanner;

public class Swapping2NoWithOther {

	public static void main(String[] args) {
		
		System.out.println("Please Enter first number that u want to Swap with another");
		
		Scanner obj = new Scanner(System.in);
		int a=obj.nextInt();
		
		System.out.println("Please Enter second number that u want to swap with firstly entered no.");
		
		int b=obj.nextInt();
		System.out.println("********No. Before Swapping********");
		System.out.println("A = "+ a + " and " + "B = "+ b);
		
		int result = a;
		a=b;
		b=result;
		System.out.println("********No. After Swapping********");
		System.out.println("A = "+ a +" and "+ ""+ "B = "+ b);
	}
}
