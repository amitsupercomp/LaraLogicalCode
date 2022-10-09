package app3;

public class K
{
	
	static int count;
	
	K()
	{
		count++;
	}
	
	K(int i)
	{
		count++;
	}
	
	public static void main(String[] args) {
		
		K k1= new K(90);
		K k2= new K();
		K k3= new K();
		K k4 =new K(10);
		System.out.println("Object created : "+count);
	}

}
