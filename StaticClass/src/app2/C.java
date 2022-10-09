package app2;

class Z
{
	static int i=100;
	static void test()
	{
		System.out.println("Z.test");
	}
}

public class C 
{
	public static void main(String[] args)
	{
		
		System.out.println(Z.i);
		Z.test(); 
		
		
//		i=1000;			can not access directly static member of another class
//		test();
		
		
//		Z z=new Z();
//		System.out.println(z.i);
//		z.test();
		
	}

}
/*
static member of another class should be use along with a class name.
*/