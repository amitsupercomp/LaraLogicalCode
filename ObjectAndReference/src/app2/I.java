package app2;

public class I 
{
	int i;
	static I test1()
	{
		I i1 = new I();
		i1.i=1;
		return i1;
	}
	
	static I test2()
	{
		I i2 = new I();
		i2.i=5;
		return i2;
	}
	
	static I test3()
	{
		return new I();		//
	}
	
	public static void main(String[] args)
	{
		
		I obj1 = test1();
		I obj2 = test2();
		I obj3 = test3();
		
		System.out.println(obj1.i+ " , "+ obj2.i+ " , "+ obj3.i);		// 1 5 0
	}
}
