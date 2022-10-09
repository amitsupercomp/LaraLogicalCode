package app3;

public class A 
{
	public static void main(String[] args) {
		
		int i=23456767;
		int a=i%10;
		int b=(i/10)%10;
		int c=(i/100)%10;
		int d=(i/1000)%10;
		int e=(i/10000)%10;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
		for(;i>0;i/=10)
			System.out.println(i%10);
		
	}

}
