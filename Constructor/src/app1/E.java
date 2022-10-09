package app1;

public class E 
{
	int i, j;
	E(int arg1, int arg2)
	{
		System.out.println("E()");
		i=arg1;
		j=arg2;
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		E e1 = new E(10,20);
		System.out.println(e1.i+" , "+e1.j);
		System.out.println("-------------");
		E e2 = new E(100,200);
		System.out.println(e2.i+" , "+e2.j);
		System.out.println("-------------");
		E e3 = new E(-1000,-2000);
		System.out.println(e3.i+" , "+e3.j);
		System.out.println("-------------");
//		E e4=e2;
//		System.out.println(e4.i+" , "+e4.j);
		System.out.println("main End");
		
	}

}
