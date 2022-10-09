package app2;

class Employee
{
	String firstName;
}

class Company
{
	Employee employee;
	Company()
	{
		employee=new Employee();
	}
}
public class India {

	Company company;
	India()
	{
		company= new Company();
	}
	public static void main(String[] args) {
		
		India india = new India();
		System.out.println(india.company.employee.firstName);
	}

}
