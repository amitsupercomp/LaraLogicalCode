package app2;

public class M13 
{
	public static void main(String[] args) {
		System.out.print("main begin");
		try
		{
			System.out.print(1);
			main(args);
			System.out.print(2);
		}
		catch(StackOverflowError err)
		{
			System.out.print(3);
		}
		System.out.print("main end");
	}

}
