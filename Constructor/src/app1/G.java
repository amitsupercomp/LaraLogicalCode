package app1;

public class G 
{
	
	int i, j, k;
	G(int i, int j, int k)
	{
		this.i=i;
		this.j=j;
		this.k=k;
	}
	
	public static void main(String[] args) 
	{
		
		G g1 = new G(10,20,4000);
		System.out.println(g1.i+" , "+g1.j+" , "+g1.k);
		
	}

}
