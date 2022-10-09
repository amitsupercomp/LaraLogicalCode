package app2;

class G extends Object
{
	G()
	{
		this(24);
		System.out.println("G()");
	}
	G(int i)
	{
		System.out.println("G(int i)");
	}
}
public class H extends G
{
	
	H()
	{
		//super(24);
		System.out.println("H()");
	}
	H(int i)
	{
		this();
		System.out.println("H(int)");
	}
	public static void main(String[] args) {
		
		//H h1 = new H();
		System.out.println("---------------------");
		H h2 = new H(90);
		System.out.println("---------------------");
		
	}

}

//compiler keeps only super(). super() with no argument always call default constructor.

