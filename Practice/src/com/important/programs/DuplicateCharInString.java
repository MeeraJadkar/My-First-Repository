package com.important.programs;

public class DuplicateCharInString {

	public static void main(String[] args) {
		
		String str = "Meera";
		String mj ="";
		for(int i=str.length()-1;i>=0;i--) {
			for (int j=i-1; j<=i; j++) {
				if(i==j) {
					System.out.println(str.charAt(i));
				}
			}
		System.out.print(str.charAt(i));
		
	}
		

	}
}
