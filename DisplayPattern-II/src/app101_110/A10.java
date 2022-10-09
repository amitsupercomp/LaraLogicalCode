package app101_110;

public class A10 {
public static void main(String[] args) {
	int size=6;
	char c='a';
	for(int i=1; i<=size; i++, c='a')
	{
		for(int j=1, n=2*i-3; j<size+i; j++)
			if(j<=size-i)
				System.out.print("  ");
			else if(j==size+i-1 || i+j-1==size)
			{
				System.out.print(c+" ");
				c=(char)((int)'a'+i-1);
			}
			else
				System.out.print(n--+" ");
		System.out.println();
	}
}
}
