package app7;

//Target Class
public class Employee 
{
	
	private Integer eid;
	private String ename;
	private String eaddress;
	
	//HAS-A variable injection
	
	private Account account;

	public Employee(Integer eid, String ename, String eaddress, Account account) 
	{
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.account = account;
	}
	
	public void display()
	{
		System.out.println("***********Employee Details************");
		System.out.println("Eid  				  is  ::  "+eid);
		System.out.println("Name  			  is  ::  "+ename);
		System.out.println("Address 		  is  ::  "+eaddress);
		System.out.println("***********Account Details************");
		System.out.println("Account 		  is  ::  "+account.getAccNo());
		System.out.println("Account Type is ::  "+account.getAccType());
		System.out.println("Account Name is ::  "+account.getAcName());
	}
	

}
