package app1;

class D
{
          	int i;
          	D()
          	{
               		System.out.println("D():" + i);
               		i = 20;
          	}
        	public static void main(String[] args) 
         	{
              		System.out.println("main begin");
              		D obj1 = new D();
              		System.out.println("-------------");
              		D obj2 = obj1;
              		System.out.println("-------------");
              		D obj3 = obj2;
              		System.out.println("-------------");
              		System.out.println(obj1.i + ", " + obj2.i + ", " + obj3.i);
              		System.out.println("main end");
        	}
}