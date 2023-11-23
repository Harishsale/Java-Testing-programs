package Alltasks;

public class Reversestring {

	public static void main(String[] args) 
	{
		String str = "john" ;
		String reverse = "";
		
		for (int i = str.length()-1; i>=0; i--)
		{
			reverse = reverse+ str.charAt(i);
			
		
		//The split () method of string class splits
		
//				String str = "john" ;
//				String [] words = str.split(" ");
//				String reversedString = "";
//				
//				for (int i=0; i<words.length; i++)
//				{
//					
//					//Stringword = word[i];
//					 String reverseWord= "";
//					 for ( int j= words[i].length()-1; j >=0; j--)
//					 {
//						 
//						 reverseWord = reverseWord + words[i].charAt(j);
//						 
//					 }
//					 reversedString = reversedString + reverseWord + " " ;
//				}
//				System.out.println(str);
//				System.out.println(reversedString);

	}
		System.out.println(reverse);
}
}

