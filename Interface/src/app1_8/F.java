package app1_8;

interface G
{
	void abc();
}
class H
{
	public void test()
	{
		System.out.println("H-test");
	}
}
public class F {
	public static void main(String[] args) {
		
		G g = new H() :: test;		//  ::   mapping the implemented method into an abstract method
		g.abc();
	}
}
