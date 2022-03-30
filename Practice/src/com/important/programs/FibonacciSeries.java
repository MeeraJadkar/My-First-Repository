package com.important.programs;

// fibonacci series is ---- 1,1,2,3,5,8,13,21......
public class FibonacciSeries {

	public static void main(String[] args) {
		
		int FirstNum=1;
		int SecondNum=1;
		int result;
		
		for(int i=0;i<=30;i++) {
			System.out.print(FirstNum + ",");
			result=FirstNum+SecondNum;
			FirstNum=SecondNum;
			SecondNum=result;
			
			
// 2,3,5,8-----1st=2, 2nd=3, result=1st+2nd=5, 1st=2nd, 2nd=result
			
		}
		
	}

}
