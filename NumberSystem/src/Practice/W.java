package Practice;

public class W 
{
	public static void main(String[] args) {
		
		System.out.println(power(2,3));
		
	}
	
	private static int power (int i, int j)
	{
		int sq=i;
		if(j==0)
			return 1;
		else if(j==1)
			return i;
		for(int k=2; k<=j; k++)
			sq=sq*i;
		return sq;
	}

}
