 /*
                 5
              5 4
           5 4 3
        5 4 3 2
     5 4 3 2 1
     */



package app2;

public class E
{
		public static void main(String[] args) 
		{
			for(int i=5; i>=1; i--)
			{
				for(int s=i; s>1; s--)
					System.out.print("   ");
				for(int j=5; j>=i; j--)
					System.out.print(j+" ");
				System.out.println();
			}
			
		}

}
