package set1;

public class B 
{
	
	B ref;
int data;
	
	B(int data)
	{
		this.data=data;
	}
	
	public static void main(String[] args) {
		B b1=new B(10);
		B b2=new B(20);
		B b3=new B(30);
		B b4=new B(40);
		
		b1.ref=b2;
		b2.ref=b3;
		b3.ref=b4;
		
		System.out.println(b1.data+"  "+b2.data+"   "+b3.data+"   "+b4.data);
		System.out.println(b1.data+"    "+b1.ref.data+"   "+b2.ref.data+"    "+b3.ref.data);
		System.out.println(b1.data+"  "+b1.ref.data+"  "+b1.ref.ref.data+"  "+b1.ref.ref.ref.data);
		
	}

}
