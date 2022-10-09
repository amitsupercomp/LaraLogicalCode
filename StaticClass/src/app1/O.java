package app1;

public class O 
{
	
	static int i=j; 		//you can not use any global variable before JVM notified.
	static int j=10;
	
	public static void main(String[] args) {
		System.out.println(i + " , "+ j);
	}

}
