package app2;

public class J 
{
	J()
	{
		System.out.println("J()");
	}
	
	J(int i)
	{
		this();
		System.out.println("J(int i)");
	}
	
	J(int i, int j)
	{
		this(j);
		System.out.println("J(int, int)");
	}
	
	public static void main(String[] args) {
		
		J j1 = new J (90);
		System.out.println("-----------------");
		J j2 = new J();
		System.out.println("-----------------");
		J j3 = new J(10, 20);
		System.out.println("-----------------");
	}

}
