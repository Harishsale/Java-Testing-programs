package Arrays;

import java.util.Arrays;

public class Singledimensional {

	public static void main(String[] args)
	{
		int [] a= {12,8,36,3,25};           //array length=5, index length=4
		int [] b= {56,2,46,34,19};
		Arrays.sort(a);                    //it will sort to ascending order 3,8,12,25,36
		Arrays.sort(b); 
		System.out.println("Second largest number is:"+a[a.length-2]);  //index-2=2 
		System.out.println("Second largest number is:"+b[b.length-2]);  //index-2=2
	
	}

}
