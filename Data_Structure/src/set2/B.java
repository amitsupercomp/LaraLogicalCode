package set2;

public class B 
{
	
	int data;
	String pos;
	B ref;
	B(int data, String pos)
	{
		this.data=data;
		this.pos=pos;
	}
	
	public static void main(String[] args) 
	{
		B b=new B(100,"first");
		b.ref=new B(200,"second");
		b.ref.ref=new B(300,"third");
		b.ref.ref.ref=new B(400,"fourth");
		b.ref.ref.ref.ref=new B(500,"fifth");
		b.ref.ref.ref.ref.ref=new B(600,"sixth");
		
		B ele=b;
		while(ele!=null)
		{
			System.out.println(ele.data+"   "+ele.pos);
			ele=ele.ref;
		}
		
		
	}
	

}
