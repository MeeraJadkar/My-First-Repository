package com.inheritance;

public class DogAsChildClass extends AnimalAsParentClass {

	DogAsChildClass() {// this is a child class constructor 
		this(45);
		System.out.println("I am from Dog Child Class");
	}
	
	DogAsChildClass(int a){
		super(4555);
		System.out.println("I am from single parameter and dog as child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 DogAsChildClass Jimmy = new DogAsChildClass();
 System.out.println(Jimmy.a);
 Jimmy.eat();
	}

}
