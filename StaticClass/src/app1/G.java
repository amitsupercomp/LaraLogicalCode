package app1;

public class G 
{
	
	static int i=j;			// Any global variable direct read is not possible before JVM notified.
	static int j=10;
}
