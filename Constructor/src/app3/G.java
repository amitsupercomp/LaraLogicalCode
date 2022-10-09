package app3;

public class G
{
	G()
	{
		System.out.println("G()");
	}
	
	G(int i)
	{
		System.out.println("I(int)");
	}
	
	G(int i, int j)
	{
		System.out.println("G(int, int)");
	}
	{
		System.out.println("IIB");		//instance initialization block
	}
	
	public static void main(String[] args) 
	{
		G g1 = new G();
		System.out.println("--------------------");
		G g2 = new G(90);
		System.out.println("--------------------");
		G g3 =new G(10,2);
		System.out.println("--------------------");
		
	}

}
/*
IIB executes for every object creation. It should be 


*/
