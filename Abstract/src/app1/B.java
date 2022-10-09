package app1;
abstract class Z
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}


public class B 
{
	
	Z obj;
	void method1(Z ref)
	{
		
	}
	
	Z method2()
	{
		return obj;
	}
	
	public static void main(String[] args) {
	
	//	Z z1 = new Z();		//can't instantiate becuase it is abstract method.	
		Z z2 = null;
		
	}

}
