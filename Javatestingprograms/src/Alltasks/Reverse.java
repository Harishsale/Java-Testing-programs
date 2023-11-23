package Alltasks;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args)
	{ 
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();   //scans the next token of the input as a integer
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;   //0*10+123%10==>0+3= rev=3
			num=num/10;          //123/10=12.3
		}
		System.out.println("Reverse number is " +rev);
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
