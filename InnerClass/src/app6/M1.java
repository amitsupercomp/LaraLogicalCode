package app6;

public class M1 
{
	
	public static void main(String[] args) {
		
		A a = new A();
		a.test1();
		a.test2();
		System.out.println("-----------------");
		
		A a2= new A()				//Here A is superclass and we should not use extends. Class is representing super class name. Object is creating to subclass to A
				{							//Right hand side subclass to A. Subclass doesn't have a name. Superclass A() constructor.which constructor we has to use.
					void test1()
					{
						System.out.println("I am  from AIC");
					}
				};
				
				a2.test1();
				a2.test2();
				
				System.out.println("--------------------");
				A a3= new A()
						{
							void test2()
								{
									System.out.println("test2--- I am from AIC");
								}
						};
						
						a3.test1();
						a3.test2();
						
						
						a3.test1();
						a3.test2();
						
						
						a3.test1();
						a3.test2();
						
						A a4 = new A()
						{
							void test2()
							{
								System.out.println("test2--- I am from AIC");
							}
							void test1()
							{
								System.out.println("test1--- I am  from AIC");
							}
							void test3()
							{
								
							}
							
						};
						
						a4.test1();
						a4.test2();
						a4=new A();
						a4.test1();
						a4.test2();
						
						
	}

}
