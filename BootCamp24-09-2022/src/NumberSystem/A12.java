package NumberSystem;

public class A12 
{
	public static void main(String[] args) {
		
		int n=10,count=0;
		boolean primeChk;
		while(count<30)
		{
			primeChk=true;
			for(int j=2; j<=n/2; j++)
				if(n%j==0)
				{
					primeChk=false;
					break;
				}
			if(primeChk && n%10>(n/10%10) && (n/10%10)>(n/100%10))
			{
						System.out.println(n);
							count++;
			}
			n++;
		}
	}

}
