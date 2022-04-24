package StaticInterface;

public interface panda {

	//within interface if we declare variable it need to be initialised 
		//Each and every variable will be static and final
	    int b=20;
		 //after compilation variable name will be like below
		 //public static final int a=2;
		 
		 //within interface you will only have static variable
		 
		 //If you try to add another access modifier , you will compilation error
		 //protected int b;
		int division1();
		// No need to add abstract keyword 
		 //By default only public access modifier is allow
		 
		 // within interface till java 8 you will have only abstract instance method
		   int add();
		   int sub();
		   default int mult() {
			   System.out.println("bye");
			   return 10;
		   }
		   static void rose() {
			   System.out.println("Hii Neha");
		   }
		   // As each and every method is abstract by default after compilation defination will change as
		   //public abstract void add();
		int division();

	}


