package app3;

public class M 
{
	
	static int count;
	
	M()
	{
		this(10);
		System.out.println("M ()");
	}
	
	M(int i)
	{
		this(10,20);
		System.out.println("M( int )");
	}
	
	M(int i, int j)
	{
		this(10,20,30);
		System.out.println("M (int int)");
	}
	
	M(int i, int j, int k)
	{
		System.out.println("M int int int");
	}
	
	{
		
		count++;
		System.out.println("Object number: "+count);
	}
	public static void main(String[] args) {
		 M m1 =new M();
		 System.out.println("--------------");
		 M m2 = new M(10);
		 System.out.println("----------------------");
		 M m3=new M(10,20);
		 System.out.println("--------------");
		 M m4= new M(1,200,300);
		 System.out.println("---------------");
		 
		 System.out.println("Total object creation : "+count);
		
	}

}
