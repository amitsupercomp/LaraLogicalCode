package app1;

public class F
{
	
	public static void main(String[] args) {
		
		double d1=9.098;
		//int i = d1;
		
		int i = (int) d1;		//there is a chance of data lost in the narrowing that's why compiler doesn't do auto narrowing, programmer have to do narrowing.
		System.out.println("Done");
		System.out.println(i + ", "+d1);

	}
}
