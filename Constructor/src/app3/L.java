package app3;

public class L
{
	static int count;
	
	L()
	{
		
	}
	
	L(int i)
	{
		
	}
	
	L(double d)
	{
		
	}
	
	{
		count++;	
	}
	
	public static void main(String[] args) {
		L l1= new L();
		L l2=new L(10);
		L l3=new L(12.9);
		L l4 = new L();
		
		System.out.println("Total count : "+count);
		
		
	}

}
/*
If there is a common execution for every object creation and also constructor got overloading.
*/
