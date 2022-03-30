package com.assignment3.ForLoop;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		int L = 0;// firstTerm
		int M = 1;// secondTerm
	    System.out.println("Fibonacci Series till 10 terms:");

	    for (int i = 1; i<=10; ++i) {
	      System.out.print(L +",");

	      int N = L + M;//N=NextTerm=firstTerm + SecondTerm N=1, N=2
	      L = M; //FirstTerm = SecondTerm L=1, L=1
	      M = N; // SecondTerm = NextTerm M=1, M=2
		}
	    System.out.println("......"); // This is to print dots in the end of series.
	}
}
