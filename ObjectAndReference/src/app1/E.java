package app1;

public class E 
{
	
	int i;
	
	public static void main(String[] args)
	{
		
		E  e1 = new E();
		E  e2 = new E();
		E  e3 = new E();
		
		System.out.println(e1.i+" , "+e2.i+" , "+e3.i);
		e1.i=10;
		System.out.println(e1.i+" , "+e2.i+" , "+e3.i);
		e2.i=20;
		System.out.println(e1.i+" , "+e2.i+" , "+e3.i);
		e3.i=30;
		System.out.println(e1.i+" , "+e2.i+" , "+e3.i);
		
		
	}

}

/*
 For every object non static member loading every time into the memory. Here three copies of i will be loading into the memory.
 
 For one class n number of objects and for one object one object n number of references.
 
 Any reference can not reference to more than one time.
 
 
 
*/