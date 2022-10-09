package app2;

public class M11 
{
	public static void main(String[] args) {
		
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			int [] elements = new int[5];
			int i = elements[5];
			System.out.println(2);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(3);
		}
		System.out.println("main end");
	}

}
