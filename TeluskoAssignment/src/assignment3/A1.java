package assignment3;

public class A1 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		String s = "iNeuron", res="";
		
		for(int i=s.length()-1; i>=0; i--)
			res=res+s.charAt(i);
		System.out.println("Original String is : "+s);
		System.out.println("Reverse String is : "+res);
		
		char a='a',b='c';
//		System.out.println(a);
//		System.out.println(b);
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}

}
