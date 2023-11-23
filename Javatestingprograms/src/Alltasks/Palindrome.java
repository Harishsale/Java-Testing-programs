package Alltasks;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		int r;
		int sum=0;
		
//		//int x=454;//it check whether the number is Palindrome or not
//		temp=x;
//		while(x>0) 
//		{
//			r=x%10; //getting remainder
//			sum=(sum*10)+r;
//			x=x/10;
//		}
//		if(temp==sum)
//			System.out.println("Given number is palindrome");
//		else
//			System.out.println("Not palindrome");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Give any number");
		int num=sc.nextInt();     //scans the next token of the input as a integer
		
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Given number is palindrome");
		else
			System.out.println("Given number is not palindrome");

	}

}
