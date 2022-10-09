package app3;

public class J 
{
	static int count ;
	J()
	{
		count++;
	}
	
	public static void main(String[] args) {
		J j1 =new J();
		J j2 =new J();
		J j3 =new J();
		J j4 =new J();
		J j5 =new J();
		System.out.println("Total object created: "+count);
		
	}

}
