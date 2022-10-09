package app4;


interface A
{
	void test1();
}
interface B
{
	void test2();
}
interface IFace extends A, B
{
	void test3();
}
public class C implements IFace
{

	@Override
	public void test1() {
		// TODO Auto-generated method stub
		System.out.println("C-test1");
		
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("C-test2");
		
	}

	@Override
	public void test3() {
		// TODO Auto-generated method stub
		System.out.println("C-test3");
		
	}
	
	public static void main(String[] args) {
		
		C c =new C();
		c.test1();
		c.test2();
		c.test3();
		
		IFace fc= new C();
		fc.test1();
		fc.test2();
		fc.test3();
		
		
	}

}
