package Weekend;

public class print {

	void method(int b)
	{
		int a = 100;
		while (a<=150)
		{	System.out.println(a);
			a=a+10;
		}
	
		if (b>=100 && b<=130)
		{	
			for (int c = 1 ; c<=10; c++)
				{if (c%2==0)
	 {System.out.print(c);}
				{System.out.print(" ");
				}
				}
	}
		if (b>=140 && b<=150)
		{
			for (int d=1; d<=10; d++)
			{if (d%2==1)
			{
				System.out.print(d);
			}
			{
				System.out.print(" ");
			}
			}
		}
	}
	public static void main(String[] args) {
		print obj = new print();
		obj.method(128);
	}
}
