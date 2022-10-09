package app2;

public class M1
{
	
	public static void main(String[] args) {
		A a1 = new A();
		
		B b1 = new B();
		
		C c1 = new C();
		
		D d1 = new D();
		
		//E e1 = new E();
		
		Object o1 =new Object();
		A a2=a1;
		B b2=b1;		//homogeneous
		C c3= c1;
		a1=a2;
		c1=c3;
		System.out.println("Done");
		
	}

}
