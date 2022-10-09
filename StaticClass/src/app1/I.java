package app1;

public class I
{
	static int a=10;
	static int b=a;
	static int c=I.d;		//indirect read is allowed before JVM notified...
	static int d;

}
