package app1;

public class H 
{
	static int a=10;
	static int b=a;
	static int c=d;		//direct read is not allowed before JVM notified...
	static int d;

}
