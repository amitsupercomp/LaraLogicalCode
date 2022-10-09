package app2;

public class B 
{
	static int i = 50;
	public static void main(String[] args) 
	{
		
		B b1 = new B();
		B b2 = new B();
		B b3 = new B();
		B b4 = new B();
		B b5 = new B();
		B b6 = new B();
		B b7 = new B();
		
		System.out.println(b1.i);
		b4.i=200;
		System.out.println(b1.i);
		System.out.println(b2.i);
		System.out.println(b3.i);
		System.out.println(b4.i);
		b5.i=500;
		System.out.println(b5.i);
		System.out.println(b6.i);
		System.out.println(b7.i);
		
		
	}

}
/*
 * Static variable can be used along with a class name and reference variable.
 * In this case compiler converts reference to class name i.e. b1.i treated as B.i
 * 
 * Static is common to all object whereas non-static specific to the object.
 * 
 * Static member loading to the memory onle one time while non-static loading to the memory according to the object. It will create copy of non-static into the heap memory. 
 * 
 */
