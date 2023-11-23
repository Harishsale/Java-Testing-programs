package Alltasks;

import java.util.Scanner;

public class Divisibleby5 {

	public static void main(String[] args)
	{
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter i value");
		int i=sc.nextInt();
		for(;i<=50;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Counted numbers divisible by 5: " +count);
		

	}

	
}
