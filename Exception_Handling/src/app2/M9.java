package app2;

public class M9 
{
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			int i =Integer.parseInt("abc");
			System.out.println(2);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(3);
		}
		System.out.println("main end");
	}

}
