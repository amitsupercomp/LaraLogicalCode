package app3;

class D
{
	void test()
	{
		System.out.println("from test-D");
	}
}

public class E extends D
{
	void test()
	{
		System.out.println("test-E");
		super.test();
	}
	
	public static void main(String[] args) {
		
		E e1 = new E();
		e1.test();
	}

}

//super is used for acceesing for super class non static member and availabe in the non static definition block.
