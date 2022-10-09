package app3;

public class D 
{
	
	public static void main(String[] args) {
		
		int i=12398756;
		int j=0;
		int k=0;
//		int n=i;
//		
//		j=i;
//		while(j>0)
//		{
//			k++;
//			j/=10;
//		}
//		j=i;
//		i=0;
//		
//		int l=k/2;
//		int loop=k;
//		while(l>=0)
//		{
//			i=i*10+(j/(int)Math.pow(10, k)%10);
//			k--;
//			l--;
//		}
//		l=loop/2;
//		System.out.println(n);
//		 n=i%(int)Math.pow(10, l);
//		System.out.println((int)Math.pow(10, l));
//		System.out.println(n);
//		j=0;
//		System.out.println(l);
//		while(l>=0)
//		{
//			j=j*10+(n/(int)Math.pow(10, l)%10);
//			l--;
//		}
		
		
		int m=i;
		int count=0;
		while(m!=0)
		{
			count++;
			m=m/10;
		}
		
		int factor =1;
		for(int n=1; n<=count/2; n++ )
			factor*=10;
		j=i/factor;
		k=i%factor;
		
		
		
		
		System.out.println(j);		//1239
		System.out.println(k);		//8756
	}

}
