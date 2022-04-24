package StaticInterface;

public class Math implements InterfaceWithStaticAndDefault, NewInterfaceWithStaticAndDefault {

	// both interface is having same abstract method but while implementing u need to implement it only once.
	public void add(int a, int b) {
		System.out.println("Addition " +(a+b));	
	}

	// As both interface is having same default methods to resolve method ambiguity java force us to mention which interface method u have to call
	public void sub(int a, int b) {	
		InterfaceWithStaticAndDefault.super.sub(4, 5);
	}

	public static void main(String[] args) {
		
		Math obj= new Math();
		obj.add(5,10);
		obj.sub(20,10);
		InterfaceWithStaticAndDefault.multiplication(10, 20);
		

	}

}
