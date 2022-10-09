package app2;


class Q
{
	int i;
	int j;
}
public class R
{
	Q obj;
	R()
	{
		obj=new Q();	
	}//has-a relation		whole and part relation.
	void test()
	{
			obj.i=10;
			obj.j=20;
			System.out.println(obj.i);
			System.out.println(obj.j);
//			i=10;
//			j=20;
	}
	public static void main(String[] args) {
		R r1 = new R();
		r1.test();
		
	}
}

//PART MEMBERS WE CANNOT USED DIRECTLY IN THE WHOLE
//PART MEMBERS CAN BE USED IN THE WHOLE ALONG WITH THE PART REFERENCE VARIABLE

//there may be a chance to get  null pointer exception while using part member by using part members.
//part should be initialized with a object. either while declaring or in the constructor body.
