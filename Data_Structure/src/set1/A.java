package set1;

public class A
{
	int data;
	
	A(int data)
	{
		this.data=data;
	}
	
	public static void main(String[] args) {
		A a1=new A(10);
		A a2=new A(20);
		A a3=new A(30);
		A a4=new A(40);
		
		System.out.println(a1.data+"  "+a2.data+"   "+a3.data+"   "+a4.data);
		
		
	}

}
