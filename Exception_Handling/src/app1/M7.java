package app1;

public class M7 
{
	public static void main(String[] args) {
		System.out.println(1);
		
		StringBuffer[] strings = new StringBuffer[99999999];
		for(int i=0; i<strings.length; i++)
		{
			strings[i]=new StringBuffer("abc");
		}
		System.out.println(2);
	}

}
