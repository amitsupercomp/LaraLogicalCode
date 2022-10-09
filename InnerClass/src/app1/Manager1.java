package app1;

public class Manager1
{
	
public static void main(String[] args) {
		
		Job j1 = new Job("Software", 50000.0);
		Job j2 = new Job("Hardware", 7000.0);
		Job j3 = new Job("Hardware", 17000.0);
		Job j4 = new Job("Sales", 31000.0);
		Job[] jobs= {j1, j2, j3, j4};
		Employee emp = new Employee("Mohan",jobs);
		
		System.out.println("Print first time");
		
		Job obj;
		while(emp.hasMoreJobs())
		{
			obj = emp.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
		emp=new Employee("Mohan",jobs);
		
		System.out.println("\nPrint second time");
		
		while(emp.hasMoreJobs())
		{
			obj = emp.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
		
		System.out.println("\nPrint Third time");
		emp =new Employee("Mohan", jobs);
		while(emp.hasMoreJobs())
		{
			obj = emp.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
	}


}

//by creating new object we can print all times.
