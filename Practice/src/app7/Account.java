package app7;

//dependent object
public class Account 
{
	
	//instance variable
	private String accNo;
	private String accType;
	private String acName;
	
	//Performing Constructor Injection
	public Account(String accNo, String accType, String acName)
	{
		this.accNo=accNo;
		this.accType=accType;
		this.acName=acName;
	}

	public String getAccNo() {
		return accNo;
	}

	public String getAccType() {
		return accType;
	}

	public String getAcName() {
		return acName;
	}
	

}
