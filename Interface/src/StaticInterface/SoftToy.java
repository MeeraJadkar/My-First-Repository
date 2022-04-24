package StaticInterface;

public class SoftToy implements panda,Teddy{

	public int add() {
		System.out.println("I am from add method of Panda");
		return 0;
	}
	public int sub() {
		System.out.println("I am from sub method of Panda");
		return 0;
	}
	public int mult() {
		// TODO Auto-generated method stub
		return panda.super.mult();
	}
	public static void main(String[] args) {
		SoftToy obj = new SoftToy();
		obj.add();
		obj.sub();
		obj.mult();
		panda.rose();
		Teddy.rose();
		System.out.println("The Value of B is " +b);

	}
	@Override
	public int division1() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int division() {
		// TODO Auto-generated method stub
		return 0;
	}
}
