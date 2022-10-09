package app1;

class E
{
	E()
	{
		System.out.println("E()");
	}
}
public class F extends E
{
	F()
	{
		//super();	By default JVM will add super(), which call to super class constructor first then execute rest of the code.
		System.out.println("F()");
	}
	public static void main(String[] args) {
		System.out.println("F-main-begin");
		F f1=new F();
		System.out.println("F-main-end");
	}

}

//Constructor IIB and SIB not involving in the inheritance and are not inherited by sub-class.

//sub class constructor giving a call to super class constructor.

// In a constructor, first statement should be either super() or this().

//If programmer is not develop this() or super() statement, compiler will provide super() statement.

//Attributes and methods are inherit to sub-class.

//
