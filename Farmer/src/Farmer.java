import java.util.Scanner;

public class Farmer 
{
	
	private int principal;
    private static float rate;
	private byte time;
	private double si;
	
	static
	{
		rate=6.25f;
	}
	
	public void inputDetails()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hey Farmer! Enter the amount you needed");
		
		
		principal=sc.nextInt();
		
		System.out.println("Hey Farmer! enter the time you needed to repay");
		time=sc.nextByte();
	}
	
	public void computeInterest()
	{
		si = principal*rate*time/100;
	}
	
	public void display()
	{
		System.out.println("You have to pay total interest : "+si+ "\n per year : "+si/time );
	}

}
