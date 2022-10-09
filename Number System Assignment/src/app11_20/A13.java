package app11_20;

public class A13
{
	
	public static void main(String[] args) {
		
		int n=2345678;
		int count=0;
		int duplicate=n;
		while(duplicate>0)
		{
			count++;
			duplicate/=10;
		}
		count--;
		while(count>=0)
		{
			System.out.println(n/(int)Math.pow(10, count)%10);
			count--;
		}
		
	}

}
