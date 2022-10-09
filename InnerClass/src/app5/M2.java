package app5;

public class M2 
{
	
	class A
	{
		
	}
	
	static class B
	{
		
	}
	
	public static void main(String[] args)
	{
		A a1=null;
		B b1=null;
		M2 ref= null;
		
		//a1=new A();		//We can not create object directly because A is non static.
		a1=new M2().new A();
		
		a1=ref.new A();
		
		b1= new B();
		b1= new M2.B();		// Class B can be used along with the class name becuase it is a static class. We are using M2 to access B.
		System.out.print("done");
		
	}

}
