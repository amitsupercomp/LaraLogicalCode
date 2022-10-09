package app11_20;

public class A3
{
		public static void main(String[] args) {
			
			for(int i=1; i<=5; i++)
			{
				for(int j=1; j<=i+1; j++)
					if(j==2)
						System.out.print("  ");
					else
						System.out.print((char)(64+i)+" ");
				System.out.println();
			}
		}
}
