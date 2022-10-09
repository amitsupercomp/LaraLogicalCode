package app2;

public class M {
	M()
	{
		this(10);
		System.out.println("M()");
	}
	
	M(int i)
	{
		System.out.println("M(int)");
	}
	{
		System.out.println("M-IIB");
	}
	
	public static void main(String[] args) {
		
		M m1 = new M();
		System.out.println("-----------------");
		M m2 = new M(20);
	}

}
