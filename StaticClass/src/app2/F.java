package app2;

class V
{
	static int i =100;
	static void test()
	{
		System.out.println("V-test");
	}
	
	static
	{
		System.out.println("V-SIB");
	}
}


class W
{
	static int i =500;
	static void test()
	{
		System.out.println("W-test");
	}
	static
	{
		System.out.println("W-SIB");
	}
}

public class F 
{
	static
	{
		System.out.println("F-SIB");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(W.i);
		W.test();
		System.out.println("----------------------");
		System.out.println(V.i);
		V.test();
		System.out.println("-----------------------");
		System.out.println(W.i);
		W.test();
		System.out.println("----------------------");
		System.out.println(V.i);
		V.test();
		System.out.println("-----------------------");
		System.out.println(W.i);
		W.test();
		System.out.println("-----------------------");
		System.out.println("main end");
		
	}

}

/*
 First Static initializer of F class will execute then java command goes into main() of F... After printing main begin  i static member of W class to print.
 Control load W class and executes static block first then print value of i.. then next line test() of W class call, but in this time static block will not be executed because it executes only once which is done at the time of W.i printing.
 Same case apply on V class.. After first phase execution again we call same W.i W.test() and V.i and V.test()... In this phase no static block of both class will be executed becuase it will execute only once..
  
  
  At the time of loading Class Initializer will executes only..
  
  Same class will not be load into the memory again and again.. It loads once and use again and again...
  
  In one java file any no. of classes can be develop. In one java file maximum one class can be public.(either 0 or 1)
  
  If any java file contain a public class then file name should be same as public class name.
  
 */










