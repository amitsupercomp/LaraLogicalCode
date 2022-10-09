package app4;

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
	
	//in order to achieve 100% encapsulation. we use inner class concept.
	
	public class JobIterator 
	{
		int index;
		Job[] jobs;
		
		public JobIterator(Job[] jobs)
		{
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
}
