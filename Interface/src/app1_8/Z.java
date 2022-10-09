package app1_8;

public interface Z
{
	default void xyz()
	{
		System.out.println("Amit");
	}
	
	public static void abc()
	{
		System.out.println("Amit static ");
	}
	
	public static void main(String[] args) {
		
		System.out.println("Interface main");
		
	}

}
