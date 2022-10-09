package app2;

public class B 
{
	public static void main(String[] args) {
		int i=3451234;
		i=i/10;
		System.out.println(i);
		i=i/100;
		System.out.println(i);
		i=i/1000;
		System.out.println(i);
		i=i/10000;
		System.out.println(i);
		i=i/100000;
		System.out.println(i);
		i=i/1000000;
		System.out.println(i);
		
		i=3451234;
		int j=1;
		for(; i>0; i=i/10)
			j*=10;
		System.out.println(j);
		System.out.println(i/j);
		
	}

}
