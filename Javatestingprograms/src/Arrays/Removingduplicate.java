package Arrays;

import java.util.Arrays;

public class Removingduplicate {

	public static void main(String[] args) {
		int [] a= {12,36,8,36,3,25};           //array length=5, index length=4
		Arrays.sort(a);                    //it will sort to ascending order 3,8,12,25,36
		int [] b= new int [6];

		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if( a[i]!=a[j])
				{
				   int c=a[i];
				   b[i]=c;
				}
			
		    }
			
		}
		for (int bb:b)
		{
			System.out.println(bb);
		}
	}

}
