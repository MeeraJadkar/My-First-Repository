package com.assignment3.SwitchCase;

public class EvenOddUsingSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Num=100;
		
		System.out.println("Here we are checking whether the no. is EVEN or ODD:");
		switch(Num%2) {
		case 0: 
			System.out.println("The No. is Even");
			break;
		default:
			System.out.println("The No. is Odd");
			break;
		}
	}

}
