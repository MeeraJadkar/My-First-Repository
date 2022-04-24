package StaticInterface;

public interface NewInterfaceWithStaticAndDefault {

	void add(int a, int b); // compiler will write it as public abstract add(int a, int b);

	// Default Method
	default void sub(int a, int b) {
		System.out.println(a-b);
	}

	// static method
	static void multiplication(int a, int b) {
		System.out.println(a*b);
	}
}
