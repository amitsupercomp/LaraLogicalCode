package app6;

public class H 
{
	
	public static void main(String[] args) {
		
		int i=1;
		System.out.print((i++==i++) || (++i==i++));
		System.out.println("," +i);
		
		boolean b=true;
		System.out.println(b);
		
		String s1="Amit";
		String s2= s1+" is my name";
				String s3="My name is "+s1;
				System.out.println(s1);
				System.out.println(s2);
				System.out.println(s3);
				
				int a=1;
				String s="Amit";
				char c='a';
				double d=23.09;
				System.out.println(a==c);
				System.out.println(c==d);
				System.out.println(a==d);
//				System.out.println(a==b);
//				System.out.println(a==true);
				
				System.out.println(s=="amit");
//				System.out.println(b==s);
				i=0;
				System.out.println(false || (i++ == 0));
				System.out.println(i);
				String str="101101";
				 i=Integer.parseInt("101101");
				System.out.println(i);
				System.out.println(~45);
				int j=1;
				if(++j == ++j)
				{
					System.out.println("Done");
					i++;
					
				}
				else
				{
					int k=100;
					System.out.println(k);
					
				}
				//System.out.println(k);
				
				int k;
				if(true)
					k=10;
				else;
					k=34;
				System.out.println(k);
				
				{
					System.out.println("Block");
					i++;
					System.out.println(i);
				}
				System.out.println(i);
	}

}
