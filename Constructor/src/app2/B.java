package app2;

public class B
{
	B(int i, int j)
	{
		System.out.println("I(int int)");
	}
	
	B(int i, double d)
	{
		System.out.println("B(int i, double d)");
	}
	
	B(double i, double j)
	{
		System.out.println("B(double double)");
	}
	
	B(double i, int j)
	{
		System.out.println("B(double int)");
	}
	public static void main(String[] args) {
		B b1 = new B(1,30);
		System.out.println("-----------------");
		B b2 = new B(1, 3.9);
		System.out.println("-----------------");
		B b3 = new B(1.4, 30);
		System.out.println("-----------------");
		B b4 = new B(1.6, 1.3);
		System.out.println("-----------------");
		//B b5 = new B();
	}

}
