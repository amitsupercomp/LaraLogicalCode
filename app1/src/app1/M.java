package app1;

public class M 
{
	
	public static void main(String[] args) 
	{
		
		String s1="Amit";
		String s2=new String("Amit");
		char[] c= {'a', 'm', 'i','t'};
		
		String s="";
		String s3=new String(c);
		
		System.out.println(c);
		
		System.out.println(s3);
		
		System.out.println(s2);
		
		System.out.println(s1);
		
		System.out.println(s1.charAt(0));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s.isEmpty());
		
		String name="Sachin";
		name.concat("Tendulkar");
		System.out.println(name);
		name=name.concat("Tendulkar");
		System.out.println(name);
	}

}
