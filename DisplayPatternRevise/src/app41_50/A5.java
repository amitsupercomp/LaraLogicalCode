package app41_50;

public class A5
{
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1,n1= 1, n2=i-1 ; j<=3+i; j++)
				if(j<=4-i)
					System.out.print("   ");
				else if(j>=5-i && j<=4)
					System.out.print(n1++ +" ");
				else
					System.out.print(n2--+" ");
			System.out.println();
		}
		
	}

}
