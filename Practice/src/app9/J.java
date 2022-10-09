package app9;

public class J
{
	public static void main(String[] args) {
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<6+i; j++)
					System.out.print(j<=6-i?"  ":j==6-i+1?'a'+" ":j==6+i-1?(char)(96+i):"0 ");
			System.out.println();
		}
	}

}
