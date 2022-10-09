package app9;

class A
{
	int i=10;
}

class B extends A
{
	int i=20;
}

class C extends B
{
	int i=30;
	int j=3456;
}
public class D 
{
	public static void main(String[] args) 
	{
		C c = new C();
		System.out.println(c.i);
		System.out.println(((B)c).i);
		System.out.println(((A)c).i);
		c=null;
		C c1=new C();
		c=new C();
		c=c1;
		System.out.println(c.i);
		A a= new C();
		System.out.println(a.j);
		
	}

}
