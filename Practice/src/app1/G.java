package app1;

public class G {
	public static void main(String[] args) {
		int flag=0;
		int count=0;
		for(int i=100; count<=20; i++)
		{
			for(int j=i-1; j>=2; j--)
				if(i%j==0)
					break;
		}
	}
}
