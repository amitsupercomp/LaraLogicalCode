package set1;

public class P1 {

	P1 ref;
	int data;
	P1(int data)
	{
		this.data=data;
	}
	
	public static void main(String[] args) {
		
		P1 p = new P1(25);
		System.out.println(p.data);
		p.ref=new P1(35);
		p.ref.ref=new P1(45);
		p.ref.ref.ref=new P1(55);
		p.ref.ref.ref.ref=new P1(65);
		
			System.out.println(p.data);
			System.out.println(p.ref.data);
			System.out.println(p.ref.ref.data);
			System.out.println(p.ref.ref.ref.data);
			System.out.println(p.ref.ref.ref.ref.data);
			
	}
	
}
