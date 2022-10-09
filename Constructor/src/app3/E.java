package app3;

public class E
{
	
	E(double d1)
	{
		this("abc");
	}
	
	E(String s1)
	{
		this(9.0);
	}

}

/*
 * 		Recursive invocation should not be allowed in this calling statement..
 */
