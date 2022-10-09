package app2;

public class M10 
{
	
	public static void main(String[] args) {
		
		A a1 = new B();
		B b1 =(B) a1;
		System.out.println("-----------");
		
		A a2 = new A();
		B b2 =  (B)a2;
		System.out.println("done");
		
	}
}

//Whenever Object of superclass assign to subclass that time class cast exception occurs

///By the time of compilation all the reference may not be having the object.