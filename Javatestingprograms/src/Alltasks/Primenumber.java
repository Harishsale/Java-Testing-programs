package Alltasks;

import java.util.Scanner;

public class Primenumber {    //number which is divisible by 1 or itself

	public static void main(String[] args) 
	{
		int i, div=0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
			
		for(i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println("Divisible by number " +i);
				div++;
		}

	    }
		System.out.println(div);
		if(div==2) 
		
		{
			System.out.println("It is prime number");
		}
		else
		{
			System.out.println("It is not a prime number");
		}
	}
}

