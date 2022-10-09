package app4;

class D
{
	D(int i)
	{
		System.out.println("D()");
	}
}

class E extends D
{
	E()
	{
		super(12);
		System.out.println("E()");
		return;
	}
}

public class Main extends E{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		E d  =  new E();

	}

}
