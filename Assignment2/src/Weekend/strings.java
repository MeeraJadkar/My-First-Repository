package Weekend;

public class strings {

	String s= "Akhilesh";
	
	void method (String a)
	{
		if (a==s)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}

public static void main(String[] args) {
	strings obj = new strings();
	obj.method("Suhas");
}
}
