package app1;

public class E
{
	static int i=10;
	static
	{
		System.out.println(i);
		System.out.println(j);		//can not direct read before JVM notified.
	}
	static int j=10;
	static int k=90;
	static
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		i=250;
	}
}

