package Alltasks;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) 
	{
		int num1=0;
		int num2=1;
		int num3;
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter j value");
		int j=sc.nextInt();
		System.out.println(num1);
		System.out.println(" "+num2);
		for(i=1;i<=j;i++)
		{
			num3=num1+num2;
			System.out.println(" "+num3);
			num1=num2;
			num2=num3;
		}

	}

}
