package app2;

public class D 
{
	int a;
	public static void main(String[] args)
	{
			D obj1= new D();
			System.out.println(obj1);		//hexadecimal of memory representation wherever store the object.
			System.out.println(obj1.a);
			
			D obj2 = null;		//It is a null reference. From a null reference you can not refer any member.
			System.out.println(obj2);
			System.out.println(obj2.a);		// If you refer any member you will get NullPointerException.
			
	}

}
