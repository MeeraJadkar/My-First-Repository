package com.Program.Practice;

public class sortingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] meera = {5, 7, 8, 1, 6, 2, 9};
		for (int i=0; i < meera.length ; i++) {
			for (int j=i+1; j < meera.length; j++) {
				if(meera[i] < meera[j]) {
					int x = meera[i];
					meera[i] = meera[j];
					meera[j] = x;
				}
			}
			System.out.println(" ");
			for ( int x : meera) {
				System.out.print(" " + x);
			}
		}
		
	}

}
