package app1;

public class H 
{
	
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i;
		for(i=1, System.out.println("init: "+i);test(i);System.out.println("I before change : "+i),i++,System.out.println("I after change :"+i))
		{
			System.out.println("Loop Body : "+i);
		}
		System.out.println("main end");
		
	}
	
	public static boolean test(int i)
	{
		boolean flag = i<=5;
		System.out.println("boolean result for: "+i+" is : "+flag);
		return flag;
	}

}
