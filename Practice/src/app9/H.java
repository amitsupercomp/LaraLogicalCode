package app9;

abstract class G
{
	abstract void trest1();
	abstract void test2();
}

public class H 
{
	
	public static void main(String[] args) 
	{
		
		G g= new G()
		{
				void trest1()
				{
					System.out.println("From trest1");
				}
				
				void test2()
				{
					System.out.println("From test2");
				}
		};
		
		g.trest1();
		g.test2();
		
	}

}
