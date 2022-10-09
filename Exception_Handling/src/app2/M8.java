package app2;

public class M8 
{
	public static void main(String[] args) {
		int i=10;
		try
		{
			System.out.println("try   :::    "+i);
			i+=20;
			i=10/0;
		}
		catch(ArithmeticException es)
		{
			System.out.println("catch  ::   "+i);
			i+=30;
		}
		System.out.println("main end  ::  "+i);
	}

}
