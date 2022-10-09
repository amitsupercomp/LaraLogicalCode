/*
                      1
                    1 1
                 1 0 1
              1 0 0 1
           1 0 0 0 1
        1 0 0 0 0 1
        1 1 1 1 1 1
        
        */







package app2;

public class F
{
	public static void main(String[] args)
	{
		String s1="Amit";
		s1="Sumit";
		s1="Prakash";
		s1=s1.concat(s1);
		System.out.println(s1);
		for(int i=1; i<=7; i++)
		{
			for(int s=7-i; s>=1; s--)
				System.out.print("   ");
			for(int j=i; j>=1; j--)
			{
				if(i==1 || j==i ||i==7|| j==1)
					System.out.print("1 ");
				else
					System.out.print("0 ");
				
			}
			System.out.println();
		}
	}
}
