package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		int p = 2;
		
		System.out.println("Enter a number, n");
		int n = in.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i = 0; i< numbers.length; i++) {
			numbers[i] = i+1;
			
		}
	

		while(p<n)
		{
		
		for(int i = 0; i< numbers.length; i++) {
		
			if ( numbers[i] %  p == 0 && numbers[i] != p) {
				numbers[i] = 0;
				
			}
			}
		
		p++;
	
		}
		
		for(int i = 0; i< numbers.length; i++)
			{
			if (numbers[i] != 0)
				{
				System.out.println(numbers [i] );
				
				}
			
			
			
		}
		
		
		
		

		
	}

}
