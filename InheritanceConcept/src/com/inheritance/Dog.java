package com.inheritance;

public class Dog extends Animal1{
	int a=20;
	Dog(){
	//super();
		super.a=a;// a=20
		System.out.println(a);
		System.out.println("I am from dog class");
	}
	public void eat() {
		//this.eat(4);
		System.out.println("Dog is eating");
	}
	
	public static void main(String[] args) {
		
	Dog tom = new Dog();// it will execute constructor of Parent class as well as child class.
    System.out.println(tom.a);
    tom.eat();// it will call eat method from Animal class
	}
}
