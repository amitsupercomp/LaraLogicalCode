package app1;

public class A1 
{
	public static void main(String[] args) {
		int i=102, j=12;
		System.out.println("Bigger Number is : "+(i>j?i:j));
		if(i>j)
			System.out.println(" inside if>>> Bigeer number is : "+i);
		else
			System.out.println("inside if>>> Bigger number is :"+j);
	}

}
