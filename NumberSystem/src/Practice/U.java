package Practice;


public class U
{
	public static void main(String[] args) {
			System.out.println("EProgram to print all Armstrong numbers less than 1000 ");
			
			int n=100;
			int sum,d;
			while(n<1000)
			{
				sum=0;
				d=n;
				while(d!=0)
				{
					sum+=cube(d%10);
					d=d/10;
				}
				if(sum==n)
					System.out.println(n);
				n++;
			}
	}
	private static int cube(int n)
	{
		return n*n*n;
	}
}
