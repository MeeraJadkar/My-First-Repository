package com.assignment3.ifelse;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=4;
		if(((year%4==0 && year%100!=0))||(year%400==0)) { 
	
				System.out.println("This is a Leap Year");
			}else {
				System.out.println("This is not a Leap Year");
		}
	}// 1600 1700 1800 2000
}
