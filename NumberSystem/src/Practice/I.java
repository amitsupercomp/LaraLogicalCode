package Practice;

public class I 
{
	
	public static void main(String[] args)
	{
		
		fibonacciSeriesReverse();
		
	}
	
	private static void fibonacciSeriesReverse()
	{
		int n1=0, n2=1;
		
		while(n2<=5000)
		{
			if(n1+n2>5000)
			{
				break;
			}
			n2+=n1;
			n1=n2-n1;
		}
		int temp;
		while(n2>=500)
		{
			System.out.print(n2+",  ");
			n2=   n2-n1;
			
			//interchange the value
			n2=n1+n2;
			n1= n2-n1;
			n2=n2-n1;
		}
		
	}

}


/*           n2=   n2-n1;
 * 			  n2=n1+n2
 * n1= n2-n1
 * n2=n2-n1
 * 
 * 
 * 
 * 
 * temp=n2;
			n2=n1;
			n1=temp-n1;*/












