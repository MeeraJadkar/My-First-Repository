package com.assignment3.ForLoop;

public class ForLoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
	int sum=0;// variable store

	for(int n=1;n<=10;++n) {
		sum=sum+n;
		//sum+=n;
		System.out.println(n);
		} 
	
	// Execution steps of above loop is;
	/* here n=1;----then it will go inside the loop and will perform sum=sum+n---sum=0+1---sum=1;
	 * now it will perform ++n-----n=n+1----n=2
	 * after that it will check condition for true and false. 
	 * now the cycle will go on untill the condition becomes false.
	 */
	
		System.out.println("The Sum of first 10 natural no. is: "+sum);
	}
}

	


