package app9;

public class L 
{
	public static void main(String[] args)
	{
		int size = 6;
		for(int i = 1; i < 2 * size; i++)
		{
			if(i<=size)
				for(int j = 1; j < size+i; j++)
					System.out.print(j<=size-i?"   ":"1 ");
			else
				for(int j = 1; j < 3 * size - i; j++)
					System.out.print(j <= i - size ?"   ":"1 ");
			System.out.println();
		}
		
		
		for(int i = 1; i < 2 * size; i++)
		{
			for(int j = 1; 	(i <= size && j < size + i) || (i > size && j < 3 * size - i);		 j++)
				System.out.print((i <= size && j <= size - i) || (i > size && j <= i - size)? "   ":"1 " );
			System.out.println();
		}
		
		
	}

}
