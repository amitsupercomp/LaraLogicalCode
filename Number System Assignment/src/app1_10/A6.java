package app1_10;

public class A6 
{
	public static void main(String[] args) {
		int n=45;
		if(n%5==0 && n%3==0)		//n%15==0
			System.out.println("Number is divisible by 5 and 3 both");
		else if(n%5==0)
			System.out.println("Number is divisible by 5");
		else if(n%3==0)
			System.out.println("Number is divisible by 3");
		
	}

}
