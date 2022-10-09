package app11_21;

public class A9 {
public static void main(String[] args) {
	
	int size=7;
	char c='a';
	for(int i=1; i<=size; i++,c++)
	{
		for(int s=1; s<i; s++)
			System.out.print("   ");
		System.out.print(c);
		for(int s=2*size-2*i; s>=1; s--)
			System.out.print("   ");
		if(i<size)
			System.out.print(c);
		System.out.println();
	}
}
}
