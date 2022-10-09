package app2;

public class A
{
	
	public static void main(String[] args) 
	{
	//	static int i =10;
		
	}
}
/*
  Illegal forward reference....When JVM not notified direct read.
  
  Direct read before JVM notified is not allowed it will get compile time error i.e. Illegal Forward Reference...
  
  Class member can have only static member while  local method can not have static member. Attribute can be static and method can be static.
 */