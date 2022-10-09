package set1;

public class C
{
	
	C ref;
	int data;
	C(int data)
	{
		this.data=data;
	}
	
	public static void main(String[] args) 
	{
		
		C c1=new C(100);
		c1.ref=new C(200);
		c1.ref.ref=new C(300);
		c1.ref.ref.ref=new C(400);
		System.out.println(c1.data);
		System.out.println(c1.ref.data);
		System.out.println(c1.ref.ref.data);
		System.out.println(c1.ref.ref.ref.data);
		System.out.println(c1.ref.ref.ref.ref.data);
	}

}
