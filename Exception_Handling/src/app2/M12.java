package app2;

public class M12 
{
	public static void main(String[] args) {
		System.out.println("main begin");
		try
		{
			System.out.println(1);
			StringBuffer[] st = new StringBuffer[999999999];
			for(int i=0; i<st.length; i++)
				st[i] = new StringBuffer("abc");
			System.out.println(2);
		}
		catch(OutOfMemoryError err)
		{
			System.out.println(3);
			System.out.println(err);
		}
		System.out.println("main end");
	}

}
