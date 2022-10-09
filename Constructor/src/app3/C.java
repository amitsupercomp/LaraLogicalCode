package app3;

public class C 
{
	
	C()
	{
		System.out.println();
		this();
	}

}
/*
 * this calling should be first statement of the constructor body, can not be second third onwards statements..
 */