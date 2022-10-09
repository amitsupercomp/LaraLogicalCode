package app1;

public class A 
{
	public static void main(String[] args) 
	{
		final int i=10;
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		System.out.println(i);
		int j=i;
		System.out.println(i);
		System.out.println(j);
		//i=10;
		j=100;
		System.out.println(j);
	}
}
