package app31_40;

public class A10
{
	public static void main(String[] args) {
		
		for(int i=1; i<=4; i++)
		{
			for(int j=1, n=i*2-1; j<=3+i; j++)
				if(j<=4-i)
					System.out.print("   ");
				else
					System.out.print(n--+" ");
			System.out.println();
		}
	}

}
