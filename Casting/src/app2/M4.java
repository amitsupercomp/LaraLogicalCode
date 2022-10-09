package app2;

public class M4
{
	
	public static void main(String[] args) {
		
		A a1 = new D();		//(A) new D()
		A a2 = new C();
		B b1 = new D();
		B b2  = new C();
		
		Object o1 = new C();
		Object o2 = new D();
		
		o1=b1;			//(Object) b1
		o2=a1;
		
		System.out.println("Done");
		
	}

}		//Upcasting
