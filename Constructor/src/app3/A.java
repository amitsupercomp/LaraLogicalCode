package app3;

public class A 
{
	A()
	{
		this(9,10,200);
		System.out.println("A()");
	}
	
	A(int i, int j, int k)
	{
		System.out.println("A(int int int)");
	}
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println("-----------");
		
		A a2 = new A(10,20,30);
	}

}
/*
 * This calling statement its from the constructor body in the method body.
 */