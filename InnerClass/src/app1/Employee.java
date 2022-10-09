package app1;

public class Employee 
{
	String name;
	Job[] jobs;
	int index;
	Employee(String name, Job[] jobs)
	{
		this.name=name;
		this.jobs=jobs;
	}
	
	boolean hasMoreJobs()
	{
		return index<jobs.length;
	}
	
	Job nextJob()
	{
		return jobs[index++];
	}

}
