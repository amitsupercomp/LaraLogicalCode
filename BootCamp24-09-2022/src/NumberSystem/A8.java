package NumberSystem;

public class A8
{
	
	public static void main(String[] args) {
		
		int n=70;
		boolean primeChk;
		while(n>=20)
		{
			primeChk=true;
			for(int j=2; j<=n/2; j++)
				if(n%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk)
				System.out.println(n);
			n--;
		}
	}

}
