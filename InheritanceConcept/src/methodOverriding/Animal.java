package methodOverriding;

 public class Animal {

	public void Sound() {
		System.out.println("No sound");
	}
	public void sleep() {
		System.out.println("I am from parent class");
	}
}
	class Dog extends Animal{
		public void Sound() {
			System.out.println("Bark");
		}
	}
	class Cat extends Animal{
		public void Sound() {
			System.out.println("Bow Bow");
		}
		public static void main(String[] args) {
			Cat obj = new Cat();
			obj.sleep();
			System.out.println("Hi meera here");
				/*obj.Sound();
				obj.Sound();
				*/
			}
		}
	
	

	


