package Practice;

public class D 
{
	public static void main(String[] args) {
		
		for(int i=1; i<=6; i++)
		{
			for(int j=0; j<=5; j++)
				if(i==1 || j==5 || i==6)
					System.out.print("0");
				else
					System.out.print(j);
			System.out.println();
		}
		
		System.out.println("********************************");
		for(int i=1; i<=6; i++)
		{
			for(int j=1,n=i-1; j<=6;j++)
				if(i==1 || i==6 || j==6 || j==1)
					System.out.print("0");
				else
					System.out.print(n++);
			System.out.println();
		}
		
		
		System.out.println("**********************************");
		for(int i=1; i<=6; i++)
		{
			for(int j=i-2; j<4+i; j++)
				if(i==1 || j==i-2 || j==4+i-1 || i==6)
					System.out.print("0");
				else
					System.out.print(j);
			System.out.println();
		}
		
		System.out.println("*********************************");
		
		
		for(int i=1; i<=7; i++)
		{
			for(int j=1, n=2+i; j<=6; j++)
				if(i==1 || i==7 || j==1 || j==6)
					System.out.print("0");
				else
					System.out.print(n--);
			System.out.println();
		}
	}

}
