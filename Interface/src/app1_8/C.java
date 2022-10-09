package app1_8;

public interface C
{
	
	B b1=null;
	
	A a=null;
	
	public static void main(String[] args) {
		
		B b;
		b=null;
		A a = new A();
		System.out.println(a);
		System.out.println("C-main");
		System.out.println(b);
		System.out.println(b1);
	}

}
