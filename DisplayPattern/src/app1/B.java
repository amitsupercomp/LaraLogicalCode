package app1;

public class B
{
	public static void main(String[] args) {
//		int size=5;
//		for(int i=1; i<=size; i++)
//		{
//			for(int j=1; j<size+i; j++)
//				if(j==size-i+1 || j==size+i-1)
//					System.out.print(i+" ");
//				else
//					System.out.print("  ");
//			System.out.println();
//		}
		
		
		
//		for(int i=size, n=1; i>=1; i--, n++)
//		{
//			for(int j=1; j<size+i; j++ )
//				if(j==size-i+1 || j==size+i-1)
//					System.out.print(n+" ");
//				else
//					System.out.print("  ");
//			System.out.println();
//		}
		
		
		
//		for(int i=1; i<2*size; i++)
//		{
//			if(i<=size)
//			{
//				for(int j=1; j<=i; j++)
//					System.out.print(j+" ");
//			}
//			else
//				for(int j=i-size+1; j<=size; j++)
//					System.out.print(j+" ");
//			System.out.println();
//		}
		
//		int size =7;
//		
//		for(int i=1; i<2*size; i++)
//		{
//			if(i<=size)
//			{
//				for(int sp=size; sp>i; sp--)
//					System.out.print("  ");
//				for(int j=1; j<2*i; j++)
//				{
//					if(j==1 || j==2*i-1 || i>3 && (j-1)%4==0)
//						System.out.print("1 ");
//					else
//						System.out.print("  ");
//				}
//			}
//			else
//			{
//				for(int sp=1; sp<=i-size; sp++)
//					System.out.print("  ");
//				for(int j=1; j<=4*size-2*i-1; j++)
//					if(j==1 || j==4*size-2*i-1 || i<2*size-3 && (i%2==0 && (j==3 || (j-3)%4==0)) || (i%2!=0 && (j-1)%4==0))
//						System.out.print("1 ");
//					else
//						System.out.print("  ");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		int n=6; char c='A';
		for(int i=1; i<=n; c=(char)(65+i),i++)
		{
			for(int j=1, num=0; j<=n; j++)
			{
				if(j<=n-i)
					System.out.print(" ");
				else 
					{
					if(j==n-i+1 || j==n || i==n)
					System.out.print(c+" ");
					else
					System.out.print(num+++" ");
					c--;
					}
			}
			System.out.println();
			}
		}
	
	
		
		
		
	}
