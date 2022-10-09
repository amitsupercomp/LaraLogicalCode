package app2;

public class M13 
{
	public static void main(String[] args) {
		
		C c1 = new C();
		System.out.println(c1.i);
		System.out.println(c1.j);
		System.out.println(c1.k);
		c1.test1();
		c1.test2();
		c1.test3();
			
		
		A a1 =  new C();
		
		if(a1 instanceof C)
		{
			C c2 = (C) a1;
			System.out.println(c2.j);
			System.out.println(c2.k);
			c2.test2();
			c2.test3();
		}
		System.out.println(a1.i);
		
		a1.test1();
		
		
		
		B b1 = new D();
		System.out.println(b1.i);
		System.out.println(b1.j);
		
		if(b1 instanceof D)
		{
			D d2 = (D) b1;
			System.out.println(d2.k);
			System.out.println(d2.l);
			d2.test3();
			d2.test4();
		}
		
		b1.test1();
		b1.test2();
		
		
	}

}

//only partial portion can access.
