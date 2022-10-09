package pack1;

class X
{
	private X()
	{
		System.out.println("X()");
	}
	
	void test()
	{
		X x1 = new X();
	}
}

public class G {

	public static void main(String[] args) {
		
		//X x = new X();
	}
}
