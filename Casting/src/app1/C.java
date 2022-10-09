package app1;

public class C 
{
	
	static void test(long arg)
	{
		System.out.println("test"+arg);
	}
	
	public static void main(String[] args) {
		
		int i=10;
		short s1=10;
		byte b1 = 90;
		test(i);		//test((long)i)
		test(s1);	//test((long)s1)
		test(b1);	//test((long)b1)
		
		
	}

}
