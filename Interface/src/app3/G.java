package app3;

interface F
{
	void test1();
	void test2();
}

interface Z
{
	void test3();
}

public class G implements F,Z
{
	public void test1()
	{
		System.out.println("G-test1");
	}
	
	public void test2()
	{
		System.out.println("G-test2");
	}
	
	public void test3()
	{
		System.out.println("G-test3");
	}
	
	public static void main(String[] args) {
		
		G g = new G();
		g.test1();
		g.test2();
		g.test3();
		System.out.println("Done");
	}
}
