package app1;

public class B
{
	public static void main(String[] args) {
		
		test();
		test(10,20);
		test(10,20,30);
		test(10,20,30,400);
		test(40,500,10,20,30,400);
	}
	
	static void test(int ...is)
	{
		System.out.println("Number of arguments  ::  "+is.length);
		System.out.println("Argumets ------");
		for(int element : is)
			System.out.print(element+" , ");
		System.out.println("----------------------");
	}

}
