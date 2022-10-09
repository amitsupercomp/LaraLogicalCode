package app1;

public class B 
{
	int i;
	B()
	{
		i=100;		//this.i = 100;
		System.out.println("B()");
	}
	public static void main(String[] args)
	{
		
		B b1=new B();
		System.out.println("-------");
		System.out.println(b1.i);
		
	}

}

/*
 * Inside a constructor body compiler automatically add 'this' keyword with variable 'i' i.e. this.i.
 */
