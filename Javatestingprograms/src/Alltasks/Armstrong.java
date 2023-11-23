package Alltasks;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args)  //armstrong 153
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter any number");
		 int x=sc.nextInt(); //scans the next token of the input as a integer
		 int sum=0;
		 int value=x;
		 
	        while (x!= 0)    // 1st loop If x=153 condition satisfy    // 2nd loop If x=15 condition satisfy       // 3rd loop If x=1 condition satisfy                                
	        {
	           int i=x%10;       //153%10=3 , i=3                      //i=15%10=5, i=5                           //i= 1%10=1 i=1
	           sum=sum+(i*i*i);       //sum=0+(3*3*3)==> Sum=27        //sum=27+(5*5*5)==>sum=152                 //sum=152+(1*1*1)==>sum=153
	           System.out.println(sum);  
	           x=x/10;          //x=153/10=15.3                      // x=15/10=1.5                              //x=1/10=0.1
	           
	        }

	        if(value==sum)         
	            System.out.println("Given number is Armstrong number");
	        else
	            System.out.println("Given number is Not Armstrong number");

	}

}
