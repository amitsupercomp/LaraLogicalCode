package app3;

class B
{
	static int i=25;
	static int j=50;
	static void show()
	{
		System.out.println("Show-B");
		System.out.println(i);
		System.out.println(j);
	}
}
public class A extends B
{
	static int  a=10;
	static int b=100;
	
	static void disp()
	{
		System.out.println("Disp-A");
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		show();
		disp();
		System.out.println(i);
		System.out.println(j);
		System.out.println(a);
		System.out.println(b);
		
	}

}
