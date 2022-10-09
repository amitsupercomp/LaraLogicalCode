package app1;

public class C 
{
	
	int i;
	int j;
	
	C()
	{
		System.out.println("I am from constructor");
		i=11;
		j=21;
	}
	
	public static void main(String[] args) 
	{
		
		C c1= new C();
		System.out.println("----------");
		System.out.println(c1.i+" , "+c1.j);
		C c2=new C();
		System.out.println("----------");
		System.out.println(c2.i+" , "+c2.j);
		//c2.j=100;
		C c3 =new C();
		System.out.println("----------");
		System.out.println(c3.i+" , "+c3.j);
		
	}

}

/*
 * Constructor is non static.
 */











