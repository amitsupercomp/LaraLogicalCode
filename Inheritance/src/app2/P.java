package app2;
 class O {
static int i;
	static
	{
		System.out.println("O-SIB");
	}
	
}
 
 public class P extends O
 {
	 static
	 {
		 System.out.println("P-SIB");
	 }
	 
	 public static void main(String[] args) {
		System.out.println("P-main-begin");
		System.out.println(O.i);
		System.out.println("------------");
		System.out.println(O.i);
		System.out.println("------------");
		System.out.println(O.i);
		System.out.println("------------");
		System.out.println("P-main-end");
	}
 }
 
 //SIBs are not involve to the inheritance.
