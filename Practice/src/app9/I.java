package app9;

import java.util.Scanner;

public class I 
{
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a numbers");
		int i = sc.nextInt();
		int j= sc.nextInt();
		int k=sc.nextInt();
		
		int mid = i<j && i>k  ||  i>j && i<k ? i : j>k && j<i ? j : k;
		
		System.out.println(mid);
		
		sc.close();
		
	}
	
	
	

}
