package app1;

public class B 
{
	
	static int i= test();				//15
	static int j=test();				//66
	
	static
	{
		System.out.println("SIB1:" +i +", "+j);		//25  66
		i=i+j+1;			// i=92
		j=i+j+2;			//j=160
	}
	
	static int test()
	{
		System.out.println("From test"+i + " , "+ j);	//0 0    15  7
		i=i+j+3;			//i=3   i=25
		j=j+i+4;			//j=7  j=36
		return i+j+5;	//15		66
	}
	
	static
	{
		System.out.println("SIB2:" +i +", "+j);		// 92   160
		i=i+j+3;			//i=255
		j=i+j+4;			//j=419
	}

	
	public static void main(String[] args) 
	{
		System.out.println("main "+ i + " , "+ j);		//255   419
		
	}

}
/*
loading operation--->> Storage --->
				 executing intializer- - -  Top to Bottom
				 
				 if i want to use a class, class should be available in memory. Either running purpose or compile purpose, class should be in a memory
				 
				 once loading is got over, class is ready to use
				 
				 
				 
				 */
