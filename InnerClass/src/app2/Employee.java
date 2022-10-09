package app2;

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
		if(index==jobs.length)
		{
			index=0;			//resetting index value as 0
			return false;
		}
		return true;
	}
	
	Job nextJob()
	{
		return jobs[index++];
	}

}
