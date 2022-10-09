package app3;


class X
{
	void test1()
	{
		System.out.println("test1");
	}
}
interface Y{
	void test2();
}
public class H extends X implements Y //order should be extends then implements
{
	
	public void test2()
	{
		System.out.println("H-test2");
	}
	public static void main(String[] args) {
		
		H h1 = new H();
		h1.test1();
		h1.test2();
		System.out.println("Done");
		
	}

}
