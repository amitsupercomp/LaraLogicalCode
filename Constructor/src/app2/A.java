package app2;

public class A 
{
	static
	{
		System.out.println("This program is related to constructor overloading");
	}
	A()
	{
		System.out.println("A()");
	}
	
	A(int i)
	{
		System.out.println("A(int i)");
	}
	
	A(double i)
	{
		System.out.println("A(double i)");
	}
	
	A(int i, int j)
	{
		System.out.println("A(int i, int j)");
	}
	
	public static void main(String[] args)
	{
		
		A a1 = new A();
		System.out.println("-------");
		A a2 = new A(15);
		System.out.println("-------");
		A a3 = new A(234l);
		System.out.println("-------");
		A a4 = new A(12,35);
		System.out.println("-------");
		
	}

}


/*
  One class can have multiple constructor. 
  While overloading a constructor multiple time there should be change in argument either number of argument or datatype of argument should change.
  While overloading a constructor signature should change.
  Overlading a constructor any number of times as long as signature is varying.
  while object is creating you should specify one of the available constructor.
  
  Need of Constructor Overloading--->>Multiple ways of Object creation.
  
  */
