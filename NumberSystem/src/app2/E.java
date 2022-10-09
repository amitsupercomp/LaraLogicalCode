package app2;

public class E 
{
	
	public static void main(String[] args) {
		
		int c=Integer.parseInt(args[0]);
		System.out.println("Number   is   :   "+c);
		System.out.println("-------------------------------");
		int rev= c, count=1;
		
		
		System.out.println("Right to Left Printing");
		System.out.println("-----------------------------");
		for(;c>0; c=c/10, count*=10)
			System.out.println(c%10);
		
		count=count/10;
		System.out.println("Left to Right Printing");
		System.out.println("----------------------------");
		
		for(; rev>0; rev=rev%count, count=count/10)
			System.out.println(rev/count);
		
		
	}

}
