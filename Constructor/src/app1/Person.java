package app1;

public class Person 
{
	String firstName, lastName;
	int age, salary;
	double weight, height;
	Person(String firstName, String lastName , int age, int salary, double weight, double height)
	{
	    this.firstName=firstName;
	    this.lastName=lastName;
		this.age=age;
		this.weight=weight;
		this.salary=salary;
		this.height=height;
	}
	
	public static void main(String[] args)
	{
		
		//Vijay data
		Person vijay= new Person("Vijay","Kumar",34, 50000, 55.89, 50.4);
		System.out.println("vijay data: First Name:  "+vijay.firstName+" , Last Name: "+vijay.lastName+" ,  Age :  "+vijay.age+" ,  Salary:  "+vijay.salary);
		System.out.println("Height(inch) : "+vijay.height+" , Weight (Kgm):  "+vijay.weight);
		
		System.out.println();
		//Mohan Data
		Person mohan= new Person("Mohan","Murali",44, 70000, 75.89, 53.9);
		System.out.println("Mohan data: First Name : "+mohan.firstName+" , Last Name:  "+mohan.lastName+" , Age:  "+mohan.age+" ,  Salary: "+mohan.salary);
		System.out.println("Height(inch) : "+mohan.height+" ,Weight(kgm) "+mohan.weight);
		
	}

}
