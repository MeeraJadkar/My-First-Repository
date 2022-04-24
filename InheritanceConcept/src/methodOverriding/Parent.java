package methodOverriding;

public class Parent {
	
	public static void Bike() {
		System.out.println("KTM");
	}
	public void house() {
		System.out.println("Antilia");
	}
	public void add() {
		int a=10;
		int b=20;
		System.out.println("Addition" +(a+b));
	}
	
	int multiplication(int a, float b) {
		System.out.println("Multiplication");
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

	class Child extends Parent{
		// method overriding is nothing but a mechanism to provide specific implementation of a method it is provided by super class
		
		public int multiplication(int x, float z) {
			System.out.println("Addition");
			return x;
		}
		public static void Bike() {
			System.out.println("Bullet");
		}
		public void house1() {
			System.out.println("Ganga Platina");
		}
		public void add() {
			float a=5.1f;
			int b=5;
			System.out.println("Addition" + (a+b));
		}
		public static void main(String[] args) {
			Child obj = new Child();
			obj.Bike();
			obj.house();
			obj.house1();
			obj.add();
			obj.multiplication(10,20.4f);
		}
	}

	