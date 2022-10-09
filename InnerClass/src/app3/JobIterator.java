package app3;

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

//If block is not there there may be more performing than others.

//For a entity only one class 