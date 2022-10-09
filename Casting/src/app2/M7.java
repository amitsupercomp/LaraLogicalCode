package app2;

public class M7 
{
	public static void main(String[] args) {
		
		A a1 = new D();
		//D d1 = a1;
		
		D d1 = (D) a1;
		
		B b1 = new D();
		C c1 = (C) b1;
		D d2 = (D) c1;
		D d3 = (D) b1;
		
		System.out.println("Done");
	}

}
