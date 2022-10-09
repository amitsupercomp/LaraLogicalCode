package app1;

public class G
{
	final int i;		//Final global variable should be initialized. Final global value can not be survived with default value.
	public static void main(String[] args) 
	{
		final int i;
		System.out.println("Done");
		System.out.println(i);
	}

}
