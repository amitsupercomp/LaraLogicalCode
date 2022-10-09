package Practice;

public class G 
{
	
	public static void main(String[] args) 
	{
		
		fibonacciSeries();
		
	}
	
	static void fibonacciSeries()
	{
		int n1=0, n2=1, count=2;
		
		System.out.print(n1+",   ");
		while(count<=10)
		{
			System.out.print(n2+",  ");
			n2=n1+n2;
			n1=n2-n1;
			count++;
		}
		
	}
}
