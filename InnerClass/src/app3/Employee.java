package app3;

public class Employee 
{
	String name;
	Job[] jobs;
	JobIterator getJobIterator()
	{
		return new JobIterator(jobs);
	}
	//int index;
	Employee(String name, Job[] jobs)
	{
		this.name=name;
		this.jobs=jobs;
	}
}
