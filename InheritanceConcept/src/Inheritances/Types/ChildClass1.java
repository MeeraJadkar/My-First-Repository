package Inheritances.Types;

  class ParentClass1 {// ParentClass1 extends Object

	public void M2() {
		System.out.println("I am from Parent Class 1");
	}
	
}

 class ChildClass1 extends ParentClass1 { //ChildClass1 extends ParentClass1 extends object

	public void M1() {
		System.out.println("I am from Child Class 1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass1 mj = new ChildClass1();
	    mj.M1();
		mj.M2();
		
		
		
	}

}
