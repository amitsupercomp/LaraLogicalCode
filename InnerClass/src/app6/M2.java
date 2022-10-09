package app6;

public class M2 
{
	
	public static void main(String[] args) 
	{
		
		B b1 = new B()
				{
					{
						System.out.println("b1");
					}
				};
				
				System.out.println("-----------------");
				
				
				B b2 = new B(30)
				{
					
				};
				
				System.out.println("-----------------");
				
				B b3 = new B("abc")
				{
					
				};
				
				System.out.println("-----------------");
		
		
	}

}
