package com.assignment2;

public class assign2 {

	public static void main(String[] args) {

		// instance method need object creation to access those methods 
		assign2 health = new assign2();
		
		health.Gym();       // calling Gym method by object health   
		health.Trainer();  // calling Trainer method by object health
		
	}
	
	     // instance method without return type and no parameter ------> public - access Modifier 
	public void Gym() { // <access modifier> <non access> <return type> method Name (arguments){}
		System.out.println("For better health doing exercise is must");
	}
	
	
       // instance method without return type and no parameter ------> private - access Modifier 
	private void Trainer() {
		System.out.println("In every field Trainer is playing a key role");
	}

}
