package app2;

class Address
{
	String hno="22/67 BTM", city="Bengaluru",state="karnataka";
}
public class Person {
	
	String fName="Amit",  lName="Kumar";
	Address ad;
	
	Person()
	{
		ad=new Address();
	}
	
	void disp()
	{
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(ad.hno);
		System.out.println(ad.city);
		System.out.println(ad.state);
	}
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
		p.disp();
	}

}
