package app3;

public class Manager1
{
	
public static void main(String[] args) {
		
		Job j1 = new Job("Software", 50000.0);
		Job j2 = new Job("Hardware", 7000.0);
		Job j3 = new Job("Hardware", 17000.0);
		Job j4 = new Job("Sales", 31000.0);
		Job[] jobs= {j1, j2, j3, j4};
		//Employee itr = new Employee("Mohan",jobs);
		
		JobIterator itr = new JobIterator(jobs);
		
		System.out.println("Print first time");
		
		Job obj;
		while(itr.hasMoreJobs())
		{
			obj = itr.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
		itr=new JobIterator(jobs);
		
		System.out.println("\nPrint second time");
		
		while(itr.hasMoreJobs())
		{
			obj = itr.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
		
		System.out.println("\nPrint Third time");
		itr =new JobIterator(jobs);
		while(itr.hasMoreJobs())
		{
			obj = itr.nextJob();
			System.out.println(obj.title+ "  :  "+obj.salary);
		}
	}


}

//by creating new object we can print all times.
