package app2;

public class M8 
{
	static void test(C c1)
	{
		System.out.println("Done");
	}
	
	public static void main(String[] args)
	{
		A a1 = new C();
		test((C)a1);
		B b1=new C();
		test((C)b1);
		
		C c1=(C) new A();
		test(c1);
		
	}
	

}
//compiler check only assignment is proper or not.