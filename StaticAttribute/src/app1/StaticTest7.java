package app1;

public class StaticTest7 
{
	static int i=10;
	static int j=20;
	static int k;
	static int m=40;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println(i+", "+j+", "+k+", "+m);
		i=100;
		j=200;
		k=300;
		m=400;
		System.out.println(i+", "+j+", "+k+", "+m);
		

	}

}
