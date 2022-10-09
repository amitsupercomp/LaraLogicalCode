package app1;

public class Q 
{
	
	static int i=test(); 		
	
	static int test()
	{
		return j;		//Indirect read is allowed in the method body before JVM notified.
	}
	
	static int j=10;
	public static void main(String[] args) {
		System.out.println(i + " , "+ j);
	}

}
