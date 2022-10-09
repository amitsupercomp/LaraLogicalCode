package app2;

class Q
{
	static void test(B b1)		//Method argument dont do the downcasting directly. get a suggestion of instanceof.
	{
		if(b1 instanceof D)		//instanceof is a boolean operator it will returns true or false
		{
			D d1 = (D) b1;
			System.out.println("We can convert into D");
		}
		else
			System.out.println("dont convert");
	}
}

public class M12
{
	
	public static void main(String[] args) {
		
		Q.test(new D());
		System.out.println("-----------");
		Q.test(new C());
		System.out.println("--------------");
		Q.test(new B());
		
	}

}
