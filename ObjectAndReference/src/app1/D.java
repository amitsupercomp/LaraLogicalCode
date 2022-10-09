package app1;

public class D 
{
	
	int i;
	public static void main(String[] args) 
	{
			D d1 = new D();
			D d2 = d1;
			D d3 = d2;
			D d4 = d1;
			D d5 = d3;
			d3.i=100;
			
			D d6 = new D();
			
			D d7=d6;
			System.out.println(d1.i);
			System.out.println(d2.i);
			System.out.println(d3.i);
			System.out.println(d4.i);
			System.out.println(d5.i);
			System.out.println(d6.i);
			System.out.println(d7.i);
	}

}
//Same Object can be reffered by multiple variable.

