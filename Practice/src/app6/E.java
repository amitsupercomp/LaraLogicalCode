package app6;

public class E {

	static
	{
		i=56;
		System.out.println(E.i);
	}
	
	static void test()
	{
		System.out.println(i);
		i=6789;
	}
	static int i;
	int j=i;
	public static void main(String[] args) 
	{
		
		E e = new E();
		test();
		System.out.println("I : "+i+", J : "+e.j);
		
	}
}
