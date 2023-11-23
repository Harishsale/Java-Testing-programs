package Alltasks;

public class Oddnumbers {

	public static void main(String[] args) 
	{
		int sum=0;
		for(int i=730;i<=805;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd numbers "+i);
				sum=sum+i;
				
			}
		}
		System.out.println("Sum of Odd numbers " +sum);

	}

}
