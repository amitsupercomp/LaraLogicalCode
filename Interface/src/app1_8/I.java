package app1_8;

interface J
{
	void test();
}

class K
{
	static void hello()
	{
		System.out.println("from hello");
	}
}

public class I {
	public static void main(String[] args) {
		J j =  K :: hello;		//no matter hello is static or non static... Hello body assigning into test; abstract method is looking for only body
		j.test();
	}
}
