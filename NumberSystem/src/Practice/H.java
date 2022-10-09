package Practice;

public class H 
{
	
	public static void main(String[] args) {
		
		
		fibonacciSeries();
		
	}
	
	static void fibonacciSeries()
	{
		int n1=0, n2=1;
		
		while(n2<=10000)
		{
			n2+=n1;
			n1=n2-n1;
			if(n2>=100)
				System.out.print(n2+",   ");
		}
	}

}
