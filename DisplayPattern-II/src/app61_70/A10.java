package app61_70;

public class A10 {

	public static void main(String[] args) {
		char c='A';
		for(int i= 10, n=1; i>=2; i-=2,c='A',n=1)
		{
			for(int j=i; j>=1; j--)
				if(j%2==0)
					System.out.print(c+++" ");
				else
					System.out.print(n+++" ");
			System.out.println();
					
		}
	}
}
