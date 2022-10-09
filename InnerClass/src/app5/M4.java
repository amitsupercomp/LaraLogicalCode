package app5;

public class M4 
{
	
	public static void main(String[] args) {
		
//		void test()
//		{
//			
//		}
		class T				//Resuing one part of the method again and again in the same method then we define local inner classes.
		{
			void print()
			{
				System.out.println(11);
				System.out.println(22);
				System.out.println(33);
			}
		}
		
		T t = new T();
		t.print();
		t.print();
		System.out.println(11);
		System.out.println(22);
		System.out.println(33);
		
		//By using this trick we can call reusable code multiple times in the main method.
		
		
		
	}

}
