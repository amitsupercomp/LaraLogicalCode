package app1;

public class P 
{
	
	static int i=P.j; 		//you can use any indirect read before JVM notified.
	static int j=10;
	
	public static void main(String[] args) {
		System.out.println(i + " , "+ j);
	}

}
