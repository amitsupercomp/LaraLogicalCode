package app3;

public class I 
{
	{
		System.out.println("IIB");
	}
	
	I(int i)
	{
		this(90,90);
		System.out.println("I(int)");
	}
	
	I(int i, int j)
	{
		System.out.println("I(int int)");
	}
	
	{
		System.out.println("IIB-I");
	}
	public static void main(String[] args) {
		I i1= new I(20);
		System.out.println("-------------");
		I i2=new I(30,40);
		System.out.println("----------------");
	}

}
/*
There are several constructor. Several base of object creation.
IIB guaranteed to execute one time no matter how many times constructor will be executed.
*/
