package app61_70;

public class A2 {
	public static void main(String[] args) {
		char c='A';
		for(int i=5; i>=1; i--,c='A')
		{
			for(int j=i; j>=1; j--,c++)
				System.out.print(c+" ");
			System.out.println();
		}
	}

}
