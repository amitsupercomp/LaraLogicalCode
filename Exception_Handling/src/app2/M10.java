package app2;

public class M10 
{
	public static void main(String[] args) {
		try
		{
			System.out.println(1);
			String s1 =null;
			int i=s1.length();
			System.out.println(2);
		}
		catch(NullPointerException ex)
		{
			System.out.println(3);
		}
		System.out.println("main end");
	}

}
