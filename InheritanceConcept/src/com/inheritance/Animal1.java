package com.inheritance;

public class Animal1 {

	int a;// a=10
	Animal1(){
		this(5);
		a=10;
		System.out.println("I am Animal Class constructor of double");
	}
	Animal1(int a){
		//this();
		System.out.println("I am animal class constructor of int type");
	}
	public void eat() {
		this.eat(4);
		System.out.println("I am eating");
	}
	public void eat(int a) {
		System.out.println("I am eating from single parameter");
	}
	public static void main(String[] args) {
	}
}
