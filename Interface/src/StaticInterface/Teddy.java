package StaticInterface;

public  interface Teddy {

	default int mult() {
		System.out.println("Hii");
		return 10;
	}
	static void rose() {
		   System.out.println("Red color");
	   }
}
