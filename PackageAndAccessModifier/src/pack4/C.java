package pack4;

import pack3.A;
public class C extends A {
	
	void show()
	{
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A a =new A();
		//System.out.println(a.z);
//		System.out.println(a.y);
		//System.out.println(a.x);
		
		//a.show();
		
		C c = new C();
		//c.show();
		
		System.out.println(c.y);
		
		c.disp();

	}

}
