package app2;

class R
{
	void test()
	{
		System.out.println("From R.test");
	}
}


class S extends R
{
	void test()
	{
		System.out.println("From S.test");
	}
}
public class M14 
{
	public static void main(String[] args) 
	{
		R r1 = new R();
		R r2 = new S();
		S s1 = new S();
		R[] elements = {new R(), new S(), r1, r2, s1};
		for(R element : elements)
		{
			element.test();
		}
		
	}
	

}

//polymorphism concept.
//same statement giving multiple output while executing different types.
//auto upcasting is mandatory to achieve polymorphism.
