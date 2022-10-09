package app1;

public class A
{
	int i;				// i is store at heap memory;
	
	public static void main(String[] args)
	{
		//System.out.println(i);
		
		A a1 = new A();				// a1 is a reference variable. Create an object a1 by using 'new' operator.
		System.out.println(a1.i);
		a1.i=109;
		System.out.println(a1.i);
		
	}
	

}


/*
 Object-->>>
 		Object is a real world entity. In java object is instance of a class.
 		
 		Non-Static member can not be used without a reference variable. To use a non-static member you should use reference variable.
 		Whenever you create an object, non static member will be loading into the memory.
 		
 		Every execution is happening in the stack. All the methods are excute in the stack memory.
 		Similarly, Objects are create in the heap memory.
 		Rference variable refer an object to create in heap memory. It exists in the stack memory.
 		
*/