package app2;

public class M6
{
	public static void main(String[] args) {
		System.out.println(1);
		try
		{
			int i=10;
		}
		catch(ArithmeticException ex)
		{
			int j=90;
			System.out.println("ex");
		}
		System.out.println(2);
//		System.out.println(i); 	//Local members of try can not be used outside a try.
//		System.out.println(j); 	////Local members of try can not be used outside a try.
	}

}
