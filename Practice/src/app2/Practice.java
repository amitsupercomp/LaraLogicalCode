package app2;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		for(int i=1; i<=3; i++)
//		{
//			for(int j=8-i; j>=4-i; j--)
//				System.out.print(j);
//			System.out.println();
//		}
	
		
		
		
		
		
//		for(int i=1; i<=6; i++)
//		{
//			for(int j=1; j<=6; j++)
//				if(i==1 || j==1 || i==6 || j==6)
//					System.out.print(0);
//				else
//					System.out.print(1);
//			System.out.println();
//		}
		
		
		
		
//		for(int i=1; i<=6; i++)
//		{
//			for(int j=1,n=1;j<=6; j++)
//				if(i==1 || i==6 || j==1 || j==6)
//					System.out.print(0);
//				else
//					System.out.print(n++);
//			System.out.println();
//		}
		
		
		
		
		
//		char c=65;
//		for(int i=1; i<=6; c=(char)(65+i),i++)
//		{
//			for(int j=1; j<=6; j++)
//				System.out.print(c++);
//			System.out.println();
//		}
		
		
		
		
//		char c=65; int size=6;
//		for(int i=1; i<=size; c=(char)(65+i),i++)
//		{
//			for(int j=1; j<=size; j++)
//				System.out.print(c+++" ");
//			System.out.println();
//		}
		
		
		
//		int size=5;
//		char c='F';
//		for(int i=1; i<=size; c=(char)(70+i), i++)
//		{
//			for(char j=c; j>=(64+i); j--)
//				System.out.print(j+" ");
//			System.out.println();
//		}
		
		
		
		int size=4;
		for(int i=1, n=0; i<=size; i++ )
		{
			for(int j=1; j<=i; j++,n++)
				System.out.print(n+" ");
			System.out.println();
		}
		

	}

}
