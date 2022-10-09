package app7;

public class C 
{
	public static void main(String[] args) {
		short i=1;
//		for( i=1, System.out.println("Value of i ::  "+i);		test(i); 		System.out.println("Value of i before change  ::  "+i),i++, System.out.println("Value of i after change  ::  "+i))
//		{
//			System.out.println("Loop  :: "+i);
//		}
		
//		for(;;)
//		{
//			System.out.println("value of i  ::   "+i++);
//			if(i==5)
//			{
//				return;
//				//continue;
//				//System.out.println();
//			}
//		}
		//System.out.println("main end  ::  "+i);
		
		do
		{
			int m=23;
			System.out.println("do-while  ::  "+i);
			m++;
			i++;
		}
		while(i<=30);
	}
	
	static boolean test(int i)
	{
		boolean flag = i<=5;
		System.out.println("flag value  ::  "+flag);
		return flag;
	}

}
