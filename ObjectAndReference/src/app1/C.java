package app1;

public class C
{
	
	int i;
	public static void main(String[] args) 
	{
		
		C c1 = new C();
		System.out.println(c1.i);
		c1.i=20;
		System.out.println(c1.i);
		
		C c2 = new C();
		System.out.println(c1.i);
		System.out.println(c2.i);
		c2.i=40;
		System.out.println(c1.i);
		System.out.println(c2.i);
		
		
	}

}

/*
Same object can be referred by multiple reference variables.

*/