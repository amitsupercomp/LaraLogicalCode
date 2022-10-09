package app2;

public class A 
{
	int i;
	public static void main(String[] args) 
	{
		A a1=new A();
		a1.i=10;
		System.out.println(a1.i);		//10
		
		A a2=new A();
		a2.i=20;
		System.out.println(a2.i);		//20
		
		a1=a2;
		System.out.println(a1.i);		//20
		System.out.println(a2.i);		//20
		
		a1.i=100;
		a2=a1;
		
		System.out.println(a1.i);		//100
		System.out.println(a2.i);		//100
		
		A a3=new A();
		a1=a2=a3;
		a3.i=50;
		
		System.out.println(a1.i);		//50
		System.out.println(a2.i);		//50
		System.out.println(a3.i);		//50
		
		
	}

}

/*
 * Same reference variable can not refer to more than one object at any case at any time means one reference variable can refer only one object at a time.
 * The object without reference variables is known as an abonded object or dead object.
 * The object which having minimum one reference variable i.e. called as live object.
 * Garbage collector will take care of removing abonded objects from the memory.
 * There is no chance of hitting back an abonded object.
 */
