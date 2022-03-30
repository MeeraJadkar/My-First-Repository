package com.assignment3.ifelse;

public class LargestAmongst3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int D=500;
		int E=1000;
		int F=1100;
		
		System.out.println("The Largest No. Amongst 3 is as below: ");
		if(D>E && D>F) {
			System.out.println(D);
		} else if(E>F) {
			System.out.println(E);
		} else {
			System.out.println(F);
		}
	/*if(D>E) {
		System.out.println(D);
	}else {
		System.out.println(E);
	}if(D>F) {
		System.out.println(D);
	}else {
		System.out.println(F);
	}*/
	
	}

}
