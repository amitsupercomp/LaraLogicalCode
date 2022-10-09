package app2;

public class C1 extends Parent {

	void running()
	{
		System.out.println("Fast");
	}
	
	public static void main(String[] args) {
		
		C1 c = new C1();
		c.running();
	}
	
}

class Parent
{
	void running()
	{
		System.out.println("slow");
	}
}
