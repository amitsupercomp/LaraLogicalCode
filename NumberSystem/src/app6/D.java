package app6;

public class D 
{
	public static void main(String[] args) {
		int count = 0, factor, j, digit, sum;
		for(int i=11; i<=1000; i++)
		{
			sum = 0;
			count =0;
			factor = 1;
			j=i;
			while(j!=0)
			{
				count=count(i);
				j=i;
				
				while(j !=0)
				{
					digit = j % 10;
					factor=pow(digit, count);
					sum+=factor;
					j=j/10;
				}
				if(i==sum)
					System.out.println(i+" , ");
			}
			
		}
	}
	static int pow(int digit, int count)
	{
		int results = 1;
		for(int i = 1; i<=count; i++)
			results*=digit;
		return results;
	}
	
	static int count(int j)
	{
		int count =0;
		while(j!=0)
		{
			count++;
			j=j/10;
		}
		return count;
	}

}
