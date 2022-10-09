package app1_8;

interface E
{
	default void test()
	{
		System.out.println("E-test");
	}
}


public class D implements E
{
	public static void main(String[] args) {
		D d = new D();
		d.test();
		
}

}
