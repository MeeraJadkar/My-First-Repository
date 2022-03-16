package com.Program.Practice;

public class PalindromeNumber {
// suppose input is 1234=4321(input is in reverse order)
// output will be 12344321------> This is PalindromeNumber
	
// Armstrong no input=123
// 1^3+2^3+3^3=1+8+27=36-----------------------Non-Armstrong No.
// 1639--1^4+6^4+3^4+9^4=1+1296+81+6561=7939---Non-Armstrong No.
// 153-----1^3+5^3+3^3=1+125+27=153------------Armstrong No.
	public static void main(String[] args) {
		
		int no=154;
		int sum=0;
		int c, rem, p=no;
		
		while(no!=0) {
			rem=no%10;//3----5-----1==========4====5====1
			c=rem*rem*rem;//27----125-----1===64===125==1
			sum=sum+c;//27-----27+125=152-----152+1=153====64====125+64=189===189+1=190
			no=no/10;//15----1-----0======15====1====0
		}
		System.out.println("The sum is = "+ sum);
	if(p==sum) {
		System.out.println("It is Armstrong No.");
	}else {
		System.out.println("It is not Armstrong No");
	}
}
}
