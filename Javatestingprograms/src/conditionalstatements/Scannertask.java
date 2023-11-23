package conditionalstatements;

import java.util.Scanner;

public class Scannertask {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scn.nextLine();
		System.out.println("Hello welcome " +name);
		System.out.println("What is your Age");
        int age=scn.nextInt();
        System.out.println("Your age is " +age);
		System.out.println("What is your state");
		String state=scn.nextLine();
		//System.out.println("Your eligible for this job " +state);
		
	}

}
