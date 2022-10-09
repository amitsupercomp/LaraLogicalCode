package app5;

class Test
{
	class A
	{
		
	}
	
	static class B
	{
		
	}
}

public class M3 
{
	public static void main(String[] args) 
	{
		Test.A a1= null;
		Test.B b1=null;
		Test t1 = new Test();
		a1=new Test().new A();
		a1=t1.new A();
		b1=new Test.B();
		System.out.println("Done");
		
		
	}

}
