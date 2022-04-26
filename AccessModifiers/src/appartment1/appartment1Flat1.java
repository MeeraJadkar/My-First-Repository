package appartment1;

public class appartment1Flat1 {

	//Access Modifiers: which modify your accessibility.
	
	
	// private is accessible within the class
	// you can not access private variable or method outside the class.
	private int tv;
	tv=10;
	
	//public is accessible everywhere, within the same package or outside the package also.
	public int garden;
	garden=50;
	
	//it can access within package 
	//that means in the same package as many classes are present protected is accessible to all of them
	//but u can't access outside the package if u don't have relation
	// it means that it is accessible outside the package also but it must have some relation
	protected int generator;
	generator=160;
	
	//if you don't specify any access modifier then it will be default.
	// if variable or method is default that means u can access it only within package
	// default will not get accessed outside though u r having any relation.
	int floor;
	floor=70;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appartment1Flat1 obj = new appartment1Flat1();
		
 System.out.println("The value of tv private is "+ obj.tv);
 System.out.println("The value of garden is "+obj.garden);
 System.out.println("The value of generator is "+obj.generator);
 System.out.println("The value for floor is "+obj.floor);
	}
}
}
