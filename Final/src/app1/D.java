package app1;

public class D
{
	int i;
	public static void main(String[] args) {
		final D d1 = new D();
		d1.i=100;
//		d1 = null;				// you can not dereferenced final reference variable
//		d1 = new D();		//We can not assign a new Object to final referece
	}

}
