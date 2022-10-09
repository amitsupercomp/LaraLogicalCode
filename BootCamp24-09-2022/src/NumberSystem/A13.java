package NumberSystem;

public class A13 
{
	public static void main(String[] args) {
		
			int n=10, count =0;
			boolean primeChk;
			while(n<=100)
			{
				primeChk=true;
				for(int j=2; j<=n/2; j++)
					if(n%j==0)
					{
						primeChk=false;
						count++;
						break;
					}
				if(count==3)
					System.out.println(n);
				if(primeChk)
					count=0;
				n++;
			}
	}

}
