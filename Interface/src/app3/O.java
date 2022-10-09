package app3;

interface M
{
	void test1();
}

interface N extends M
{
	void test2();
}


public class O implements N
{
	
	public void test1()
	{
		System.out.println("O-test1");
	}
	
	public void test2()
	{
		System.out.println("O-test2");
	}
	
	public static void main(String[] args) {
		
		O o = new O();
		o.test1();
		o.test2();
		
	}

}
