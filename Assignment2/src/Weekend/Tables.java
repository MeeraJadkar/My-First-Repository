package Weekend;

public class Tables {
	int numbers (int i, int j)
	{
		int sum=0;
		for (i=1; i<=5; i++)
		{
			for (j=1; j<=5;j++)
			{
				sum=sum+i;
				System.out.print(" "+ sum);
			}
			sum=0;
			System.out.println("");
		}
		return 0;
		
	}
public static void main(String[] args) {
	Tables obj =  new Tables();
	obj.numbers(1,1);
}
}
