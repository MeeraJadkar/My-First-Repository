package Weekend;

public class Return {

	int method (int a, int b)
		{
			if (a>b)
				return a;
			else 
				return b;
		}
	
	public static void main(String[] args) {
		Return obj = new Return();
		System.out.println(obj.method(20, 50));
	}

}
