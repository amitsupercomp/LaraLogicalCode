package app2;

class S
{
	int i;
}

class T
{
	S s1;
	T()
	{
		s1=new S();
	}
}

public class U {
	
	T t1;
	U()
	{
		t1=new T();
	}
	
	public static void main(String[] args) {
		U u=new U();
		u.t1.s1.i=23;
		System.out.println(u.t1.s1.i);
	}

}
