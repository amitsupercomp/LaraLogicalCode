package app1;

public class H
{
	
	public static void main(String[] args) {
		
		int s1 = 130;
		short s2 = (short)s1;
		short s3 = (byte)s1;		//this type of conversion not at all recommended.
		System.out.println(s1 + "  ,  "+s2+"  ,  "+s3);
		
	}

}
