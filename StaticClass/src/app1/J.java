package app1;

public class J 
{
	
	static int a=10;
	static
	{
		System.out.println(a);
		a=20;
	}
	static
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		System.out.println(a);
	}
	
	static
	{
		a=25;
	}

}
