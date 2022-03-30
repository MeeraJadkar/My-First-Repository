package com.important.programs;

import java.util.Scanner;

public class Swapping2noWithoutOther {

	public static void main(String[] args) {

		System.out.println("Please Enter First No. to Swap");
		Scanner obj = new Scanner(System.in);
		int X = obj.nextInt();
	
		System.out.println("Please Enter Second No. to swap");
		int Y = obj.nextInt();
		
		System.out.println("*******Before Swapping********");
		System.out.println("X = " +X + " and " + "Y = "+ Y);
		X=X+Y;
		Y=X-Y;
		X=X-Y;
		System.out.println("*******After Swapping*********");
		System.out.println("X = "+X + " and " + "Y = "+Y);
		
	}

}
