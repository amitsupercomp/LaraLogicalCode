package app6;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int i= sc.nextInt();
		System.out.println("Enter 2nd number");
		int j=sc.nextInt();
		System.out.println("Enter 3rd number");
		int k= sc.nextInt();
		int min = i<j ? (i<k ? i:k) : (j<k ? j : k);
		int max= i>j?(i>k ? i: k) : (j>k ? j : k);
		int middle=	max(min(i,j) , (min(max(i,j),k)));
		int middle1 = i>min && i<max ?i: j>min && j<max ?j :k;
		int middle2=i+j+k-min-max;
		System.out.println(middle2);
		System.out.println(middle);
		System.out.println(middle1);
	}
	private static int min(int i, int j)
	{
		int min=i<j?i:j;
		return min;
	}
	private static int max(int i, int j)
	{
		int max=i>j?i:j;
		return max;
	}

}
