package app11_20;

public class A9 
{
	
	public static void main(String[] args) {
		
		int n=45;
		int i=2;
		while(i<45)
		{
			if(n%i==0)
				System.out.println(i);
			i++;
		}
		
		System.out.println("*******Reverse Order********");
		i=44;
		while(i>1)
		{
			if(n%i==0)
				System.out.println(i);
			i--;
		}
	}

}
