package app1;

public class E 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		if(args.length==0)
		{
			System.out.println("please enter one command line argument");
		}
		
		int yearOfBirth=0;
				try
		{
					yearOfBirth=Integer.parseInt(args[0]);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter argument as integer value");
			return;
		}
		calculateAge(yearOfBirth);

	}
	
	public static void calculateAge(int currentAge)
	{
		if(currentAge>=2022)
		{
			System.out.println("Enter age below than 2022");
			return;
		}
		int age=2022-currentAge;
		System.out.println("Your Age is : "+age);
	}

}
