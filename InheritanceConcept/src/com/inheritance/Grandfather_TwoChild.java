package com.inheritance;

public class Grandfather_TwoChild {

	public void property() {
		System.out.println("I am from Grandfather class");
	}
	
	public  void property(int a) {
		System.out.println("I am from Grandfather class");
	}
	public void Qualities() {
		System.out.println("I am from Grandfather class-Qaulity");
	}
	/*//public static void main(String[] args) {
		System.out.println("I am from AAjoba");
	}*/
}
	
class father extends Grandfather_TwoChild {
	//2 method 1 child 
	public void Qualities() {
		System.out.println("I am from father class-Qaulity");
	}
	public static void main(String[] args) {
		father obj= new father();
		//Grandfather_TwoChild obj1 = new Grandfather_TwoChild();
		obj.property();
		obj.Qualities();
		//obj.Qualities1();
		/*obj1.property();
		obj1.Qualities();*/
		// TODO Auto-generated method stub

	}
	// child extend parent-----
}
class Uncle extends Grandfather_TwoChild{
	
	
	
}



