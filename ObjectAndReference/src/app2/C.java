package app2;

public class C 
{
	int i;
	public static void main(String[] args) 
	{
		new C();		//after this line this object will be dead.
		System.out.println(new C().i);		//there and then we use of i at the same line. after that object will be die.
		C c1=null;		
		System.out.println(c1);
	}
}
/*
Default value of every derived data type is null
*/