package app2;

public class G 
{
	int i;
	static void test( G ref1, G ref2)
	{
		System.out.println("test1: "+ref1.i +" , "+ ref2.i);		// 100  200
		ref1.i+=ref1.i;
		System.out.println("test1: "+ref1.i +" , "+ ref2.i);		//200  200
		ref2.i+=ref2.i;
		System.out.println("test1: "+ref1.i +" , "+ ref2.i);		// 200  400
		ref1.i=ref1.i + ref2.i;		//600
		ref2.i = ref2.i - ref1.i;		//-200
	}
	public static void main(String[] args) 
	{
		
		G obj1 = new G(), obj2 = new G();
		System.out.println("main1 : "+obj1.i+ " , "+obj2.i);		// 0 0
		obj1.i = 100;
		obj2.i = 200;
		System.out.println("main2 : "+obj1.i+ " , "+obj2.i);		//100 200
		test(obj1, obj2);
		
		System.out.println("main3 : "+obj1.i+ " , "+obj2.i);		// 600  -200
		
	}

}
