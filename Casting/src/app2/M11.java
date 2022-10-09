package app2;


class P
{
	static void test(B b1)
	{
		D d1 = (D) b1;
		System.out.println();
	}
}
public class M11 
{
	public static void main(String[] args) 
	{
		P.test(new D());
		
		System.out.println("---------------");
		
		P.test(new C());
		System.out.println("---------------");
		P.test(new B());
		System.out.println("----------------");
	}

}
