package set1;

public class P2 
{
	
	P2 ref;
	int data;
	String number;
	
	P2(int data, String number)
	{
		this.data=data;
		this.number=number;
	}
	
	public static void main(String[] args) {
		
		P2 p = new P2(100,"First");
		p.ref=new P2(200,"Second");
		p.ref.ref=new P2(300,"Third");
		p.ref.ref.ref=new P2(400,"Fourth");
		p.ref.ref.ref.ref=new P2(500,"Fifth");
		System.out.println(p.data+"  "+p.number);
		System.out.println(p.ref.data+"  "+p.ref.number);
		System.out.println(p.ref.ref.data+"  "+p.ref.ref.number);
		System.out.println(p.ref.ref.ref.data+"  "+p.ref.ref.ref.number);
		System.out.println(p.ref.ref.ref.ref.data+"  "+p.ref.ref.ref.ref.number);
	}

}
