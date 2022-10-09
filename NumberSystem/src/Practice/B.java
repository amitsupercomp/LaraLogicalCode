package Practice;

public class B
{
	
	public static void main(String[] args) {
		
		if(args.length<3 && args.length>3)
		{
			System.out.println("Please enter three integer value as command line argument");
			return;
		}
		
		int i=Integer.parseInt(args[0]), j=Integer.parseInt(args[1]), k=Integer.parseInt(args[2]);
		
		System.out.println("Smaller Number is among them  ::  "+(i<j && i<k?i: j<k?j:k));
		
		
		if(i<j && i<k)
			System.out.println("Smaller number is  ::  "+i);
		else if(j<k)
			System.out.println("Smaller number is  ::  "+j);
		else
			System.out.println("Smaller number is  ::  "+k);
		
		
	}

}
