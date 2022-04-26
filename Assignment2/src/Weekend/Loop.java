package Weekend;

public class Loop {

	int numbers (int a , int b)
	{
	int add= 0; int rev= 0;
	add= a+b;
	
	do 
	{
		rev=add%10;
		add=add/10;
		System.out.print(rev);
		}while (add>0);
	return rev;

	}
	public static void main(String[] args) {
	 Loop obj = new Loop();
	 obj.numbers(1234, 6789);
	
	}
}
