package app6;

public class F 
{
	public static void main(String[] args) {
		
		int size=5;
		int t=0;
		for(int i=1; i<=size; i++)
		{
			t=0;
			for(int j=1; j<size+i; j++)
			{
				if(j<=size-i || (i+j)%2==1)
					System.out.print(" ");
				else if(j== size+i-1 || j==size-i+1)
					System.out.print("1");
				else
				{
					if(t==0)
					{
						t=i-1;
						System.out.print(t);
					}
					else
					{
						if(j<=size)
						{
							t=t+2;
							System.out.print(t);
						}
						else
						{
							t=t-2;
							System.out.print(t);
						}
					}
				}
			}
			System.out.println();
		}
	}

}
