package app11_20;

public class A10 
{
	
	public static void main(String[] args) {
		
		int n=500;
		int i=2;
		while(i<n/2)
		{
			if(n%i==0)
				System.out.println(i);
			i++;
		}
	}

}
