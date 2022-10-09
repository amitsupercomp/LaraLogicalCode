package app7app8;

import app7.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account("SB-1234567", "Saving", " Amit Kumar Srivastava");
		
		Employee employee=new Employee(111, "Amit Kumar Srivastava","BTM, Bengaluru",account);
		
		employee.display();

	}

}
