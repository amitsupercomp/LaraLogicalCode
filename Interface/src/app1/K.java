package app1;

interface X
{
	void test1();
}

public class K implements X
{
	public void test1()
	{
		System.out.println("K-test");
	}
	public static void main(String[] args) {
		
		K ke = new K();
		ke.test1();
		
	}

}
