package app8;

public class G
{
	
	static
	{
		test();
		//System.out.println(i);		//direct read is not allowed
		i=20;								//direct Write
		test();
		System.out.println(G.i);		//indirect read
		G.i=50;				//indirect write.
	}
	
	static void test()
	{
		System.out.println(i);		//indirect read
		i=300;								// indirect write
	}
	static int i=67;
	public static void main(String[] args) 
	{
		
		System.out.println(i);
		
	}

}

//Direct read is not allowed before JVM notified, if it is, then it will give an error Illegal forward reference.

//Indirect read & write is allowed before JVM notified. Direct write is also allowed before JVM notified.
