package app2;

public class G
{
	G()
	{
		System.out.println("G()");
		
	}
	
	G(int i)
	{
		System.out.println("G(int)");
		
	}
	
	public static void main(String[] args) {
		
		G g1 = new G();
		System.out.println("---------------");
		G g2 = new G(200);
		System.out.println("---------------");
		G g3 = new G();
		System.out.println("---------------");
		G g4 = new G(500);
		System.out.println("---------------");
		
	}

}
