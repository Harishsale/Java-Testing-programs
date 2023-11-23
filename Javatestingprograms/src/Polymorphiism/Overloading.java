package Polymorphiism;

import java.util.Scanner;

public class Overloading {
                public void div() {
                	int a=15, b=5;
                	System.out.println("div " +(a/b));

                
            }
                public void div(int a,int b) 
          
                {
                	Scanner sc=new Scanner(System.in);
                	System.out.println("Enter a value ");
                	a=sc.nextInt();
                	System.out.println("Enter b value");
                	b=sc.nextInt();
        
                	System.out.println("div " +(a/b));
                }
                public void div(int a, double b)
                {
                	
                	System.out.println("div " +(a/b));

                }
                public void div(int a,int b, int c)
                {
                	
                	System.out.println("div " +((a/b)/c));

                }
                public static void main(String[] args)
                {
					Overloading ol=new Overloading();
					ol.div(0, 0);
					ol.div(250, 10, 5);
				}
}

