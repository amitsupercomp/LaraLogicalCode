package app1;

public class F 
{
	
	int i;
	F(int i)
	{
		this.i=i;		//i=i has no effect
	}
	
	public static void main(String[] args)
	{
		
		F f1 = new F(10);
		System.out.println(f1.i);
		
	}

}
