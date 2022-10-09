package app1;

abstract class S
{
	S()
	{
		System.out.println("Super call");
	}
	void test1()
	{
		System.out.println("S-test1");
	}
	abstract void test2();
}


public class E  extends S
{
	void test2()
	{
		System.out.println("E-test1");
	}
	
	public static void main(String[] args) {
		
		E e1 = new E();
		e1.test1();
		e1.test2();
	}

}

//It is compulsory to implement abstract method, otherwise compiler will give error.
//Every class should have a constructor and abstract class Also have.


// Constructor can not be abstract because constructor does not participate in inheritance. Abstract constructor can not be
// completed by sub-class, so it is not possible.
