package app2;

class C
{
	int i=10;
	void show()
	{
		System.out.println("in show()");
		System.out.println(this.i);
	}
}

class B extends C1
{
	int i=20;
	void disp()
	{
		System.out.println(super.i);
	}
}

public class A extends B1
{
	int i;
	public static void main(String[] args) {
		
		B1 a = new B1();
		a.show();
		System.out.println(a.i);
		System.out.println();
		a.disp();
		
	}

}
