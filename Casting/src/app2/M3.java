package app2;

public class M3
{
	
	public static void main(String[] args) {
		
		A a1 = test1();
		D d1 =test2();
		System.out.println("Done");
		
	}
	
	static A test1()
	{
		return new A();
	}
	
	static D test2()
	{
		D d1= new D();
		return d1;
	}

}
