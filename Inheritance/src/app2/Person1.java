package app2;

class Address1
{
	String houseNumber;
	String streetName;
	String city;
	String state;
}

public class Person1 {
	
	String firstName;
	String lastName;
	int age;
	Address1 address;
	
	Person1()
	{
		address=new Address1();
	}
	void read()
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(address.houseNumber);
		System.out.println(address.streetName);
		System.out.println(address.city);
		System.out.println(address.state);
	}
	public static void main(String[] args) {
		Person1 p1 = new Person1();
		p1.firstName="Amit";
		p1.lastName="Kumar";
		p1.age=32;
		p1.address.houseNumber="123/P";
		p1.address.streetName="Btm";
		p1.address.city="Bengaluru";
		p1.address.state="Karnataka";
		p1.read();
	}
}
