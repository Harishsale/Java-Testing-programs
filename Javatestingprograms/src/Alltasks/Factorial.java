package Alltasks;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int mul=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		for(;num>=1;num--)
		{
			mul=mul*num;
			System.out.print(num+"*");
			//System.out.print(mul);
		}
		System.out.println(":");
		System.out.println("factorial of a num: "+mul);
		
	}

}
