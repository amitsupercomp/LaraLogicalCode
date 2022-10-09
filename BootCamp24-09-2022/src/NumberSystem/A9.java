package NumberSystem;

public class A9 
{
	public static void main(String[] args) {
		boolean primeChk=true;
		for(int i=11; i<=200; i+=10, primeChk=true)
		{
			for(int j=2; j<=i/2; j++)
				if(i%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
				System.out.println(i);
		}
	}

}
