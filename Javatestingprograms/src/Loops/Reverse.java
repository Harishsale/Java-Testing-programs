package Loops;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter any number");
		
		int rem;
		int rev=0;
		
		while(num>0)
		{
			rem=num%10;
//			System.out.println(rem);
			num=num/10; 
//			System.out.println(num);
			rev=rev*0+rem;
//			System.out.print(rev);
		}
		    

	}

}
