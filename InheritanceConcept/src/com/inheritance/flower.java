package com.inheritance;

 class flower {

	public void colour() {
		System.out.println("I am red colour Flower");
	}
	
	public void colour(int a) {
		System.out.println("I am red colour Flower from para");
	}
	
	void smell() {
		System.out.println("I am from smell method of flower class");
	}
}
 class Rose extends flower{

		void smell() {
			System.out.println("I am from smell method of Rose class");
		} 
	 public static void main(String[] args) {
			
		 Rose obj = new Rose();
		 obj.colour();
		 obj.colour(5);
		 obj.smell();
		}
 }