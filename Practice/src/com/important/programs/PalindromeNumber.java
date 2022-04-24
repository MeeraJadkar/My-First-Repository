<<<<<<< HEAD
package com.important.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	String str = "121";
			
	String rev = "";
	
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
		System.out.println(rev);
	if(str==rev) {
		System.out.println("The number that have been entered is Palindrome no.");
	}
	}
		System.out.println("The number is not a palindrome number");
	
	}
	}
=======
package com.important.programs;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	String str = "121";
			
	String rev = "";
	
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
		System.out.println(rev);
	if(str==rev) {
		System.out.println("The number that have been entered is Palindrome no.");
	}
	}
		System.out.println("The number is not a palindrome number");
	
	}
	}
>>>>>>> branch 'master' of https://github.com/MeeraJadkar/My-First-Repository.git
