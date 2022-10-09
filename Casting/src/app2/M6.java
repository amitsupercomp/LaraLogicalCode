package app2;

public class M6 
{
	
	public static void main(String[] args) {
		
		D d1 = new D();
		Object obj = test1(d1);		//Object obj = (object) test1((C)d1)
		
	}
	
	static A test1(C c1)
	{
		B b1 = c1;		//		B b1 = (B) c1;
		return b1;		//     return (A) b1;
	}

}
