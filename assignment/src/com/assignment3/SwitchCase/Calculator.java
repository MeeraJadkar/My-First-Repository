package com.assignment3.SwitchCase;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char operator='*';
		int num1 = 2000;
		int num2= 200;
		double result;
		
		switch(operator) {
		
		case '+' : 
			result=num1+num2;
			System.out.println("Number1 " + "+ " +"Number2 " + "= " +result);
			break;
		case '-':
			result=num1-num2;
			System.out.println("Number1 " + "- " +"Number2 " + "= " +result);
			break;
		case '*':
			result=num1*num2;
			System.out.println("Number1 " + "* " +"Number2 " + "= " +result);
			break;
		case '/':
			result=num1/num2;
			System.out.println("Number1 " + "/ " +"Number2 " + "= " +result);
			break;
		default:
			System.out.println("Invalid Operator");
			break;
		}
	}

}
