package app3;

public class C
{
	
	public static void main(String[] args) {
		
		int i=734286487;
		int count=0;
		
		int j=i;
//		for(;j>0;j/=10)
//			count++;
		
		while(j>0)
		{
			count++;
			j/=10;
		}
		//System.out.println(count);
		
		
		
		count=(int)Math.pow(10,count);
		while(count>1)
		{
			count/=10;
			System.out.println((i/count)%10);
			
		}
	//	System.out.println(count);
		
	}

}
