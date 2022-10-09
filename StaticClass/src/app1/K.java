package app1;

public class K 
{
	static
	{
		System.out.println(a);		//Direct read is not allowed here
		a = 20;		//Direct write is allowed
	}
	
	static int a=10;		
	
	public static void main(String[] args) {
		System.out.println(a);
	}

}
