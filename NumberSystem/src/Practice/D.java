package Practice;

public class D 
{
	
	public static void main(String[] args) 
	{		
		int n=45;
		System.out.println("Number is  ::  "+n);
		System.out.println("------------------------");
		System.out.println("Divisibles in reverse orders are");
		System.out.println("--------------------------------------");
		System.out.print(n+"   ");
		for(int i=n/2;		i>=1;		 i--)
			if(n%i==0)
				System.out.print(i+"    ");
		
		
		
	}

}
