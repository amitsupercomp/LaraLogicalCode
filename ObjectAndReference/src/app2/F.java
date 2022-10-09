package app2;

public class F 
{
	int i;
	static void test(F obj)
	{
		System.out.println("test1: "+obj.i);
		obj.i=200;
		System.out.println("test2: "+obj.i);
	}
	public static void main(String[] args) 
	{
		F f1 = new F();
		f1.i=10;
		System.out.println("main1 : "+f1.i);
		test(f1);
		System.out.println("main :"+f1.i);
		
	}

}

/*
 *  Here both object f1 and obj refering to same i.
 *  
 *  To wherever f1 is pointing to the same even obj is also pointing. f1 can not used to be outside the main. Arguments are scope to the local method.
 *  
 *  One object can have different refeences which are from same method or different methods..abstract
 */