package app71_80;

public class A9 {

	public static void main(String[] args) {
		char c='a';
		for(int i=1; i<=8; i++)
		{
			for(int j=1; j<=8; j++)
				if(j<i)
					System.out.print("   ");
				else
					System.out.print(c+" ");
			c++;
			System.out.println();
		}
	}
}
