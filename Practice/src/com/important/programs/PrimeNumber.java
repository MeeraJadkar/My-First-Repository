package com.important.programs;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Please Enter a number for checking no. is Prime or not? ");
		Scanner num=new Scanner(System.in);
		int Number = num.nextInt();
		boolean flag=false;
		
		for(int i=2; i<=Number/2; i++) { 
		if(Number%i==0) { 
			flag = true;
			break;
		}
		}
		if(!flag) {
			System.out.println(Number + " is a Prime number.");
		}else {
			System.out.println(Number + " is not a Prime number.");
		}
	}

}
