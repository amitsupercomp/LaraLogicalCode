package app2;

public class D 
{
	public static void main(String[] args) {
		int i=345142876;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		i=i/10;
		System.out.println(i%10);
		
		
		i=345142876;
		for(; i>0; i=i/10)
			System.out.println(i%10);
		
		i=345142876;
		while(i>0)
		{
			System.out.println(i%10);
			i=i/10;
		}
		i=345142876;
		System.out.println(i  %  10);
		System.out.println((i/10)  %  10);
		System.out.println((i/100)  %  10);
		System.out.println((i/1000)  %  10);
		System.out.println((i/10000)  %  10);
		System.out.println((i/100000)  %  10);
		System.out.println((i/1000000)  %  10);
		System.out.println((i/10000000)  %  10);
		System.out.println((i/100000000)  %  10);
		
		System.out.println(i/100000000); 
		System.out.println(i/10000000); 
		System.out.println(i/1000000); 
		System.out.println(i/100000); 
		System.out.println(i/10000); 
		System.out.println(i/1000); 
		System.out.println(i/100); 
		System.out.println(i/10); 
		
		
	}
	

}
