package app1;

public class C 
{
	public static void main(String[] args) {
		final int[] elements = {10,20,30};	//this location can be changed
		for(int a:elements)
			System.out.println(a);
		elements[1]=234;
		//elements=null;		//elements is final it can not be modified.
		//elements = new int [9];
		for(int a:elements)
			System.out.println(a);
		System.out.println("Done");
	}

}
