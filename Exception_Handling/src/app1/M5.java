package app1;

class A{}
class B extends A{}

public class M5 
{
	
	public static void main(String[] args) {
		
		System.out.println(1);
		//B b1 = (B) new A();
		A a1 = new A();
		B b1=(B) a1;
		System.out.println(2);
	}

}
