package app1;

public class B
{
	int i=250;
	int j=250;
	{
		System.out.println("up"+i);
		System.out.println("up"+j);
	}
	public static void main(String[] args) 
	{
//		System.out.println(i);
//		System.out.println(j);
		
		B b1 = new B();
		
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		b1.i=100;
		b1.j=200;
		
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		System.out.println(b1);
		System.out.println(b1.hashCode());
		
		b1.i=500;
		b1.j=1000;
		
		
	}
	{
		System.out.println("bottom"+i);
		System.out.println("bottom"+j);
	}

}
