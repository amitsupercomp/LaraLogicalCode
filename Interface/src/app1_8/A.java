package app1_8;

interface B
{
	static void test1()
	{
		System.out.println("test1");
	}
}

public class A {
	
	public static void main(String[] args) {
		
		B.test1();
		B.test1();
		B.test1();
		
	}

}
