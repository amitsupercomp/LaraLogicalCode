package app3;

public class A
{
	final int i;
	
	A(int i)
	{
		this.i=i;
	}
	
	public static void main(String[] args) {
		
		A a1 = new A(90);
		A a2= new A(900);
		A a3 = new A(456);
		
		System.out.println(a1.i);
		System.out.println(a2.i);
		System.out.println(a3.i);
		
	}

}
