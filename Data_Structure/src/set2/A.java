package set2;

public class A 
{
	int data;
	A ref;
	A(int data)
	{
		this.data=data;
	}
	public static void main(String[] args) 
	{
		
		A a1=new A(100);
		a1.ref = new A(200);
		a1.ref.ref=new A(300);
		a1.ref.ref.ref=new A(400);
		a1.ref.ref.ref.ref=new A(500);
		A ele=a1;
		while(ele!=null)
		{
			System.out.println(ele.data);
			ele=ele.ref;
		}
		
		
		
	}

}
