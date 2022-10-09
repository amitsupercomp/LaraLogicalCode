package Practice;

public class J 
{
	
	public static void main(String[] args) 
	{
		
		
		printNumberImmFib();
		
		
		
	}
	
	private static void printNumberImmFib()
	{
		int n1=0,n2=1;
		int num;
		
		System.out.println(num=n1+1);
		System.out.println(num=n2+1);
		
		while(n2<=5000)
		{
			if(n1+n2>5000)
				break;
			
			n2=n1+n2;
			n1=n2-n1;
			System.out.println(num=n2+1);
		}
		
	}

}
