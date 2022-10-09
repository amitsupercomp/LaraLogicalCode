package app1;

public class A 
{
	A()
	{
		System.out.println("A()");
	}
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println("-----");
		A a2 = new A();
		System.out.println("-----");
		A a3 = new A();
		System.out.println("-----");
		A a4 = new A();
		System.out.println("Done");
		
	}

}

/*
 * Constructor should have same name as class name.
 * It should not have return type as method.
 * Constructor should not be static, final, abstract and synchronised.
 * 
 * Constructor will be executed automatically whenver object is creating.
 * By constructor we can initialize object member
 * 
 * 
 * 
 */