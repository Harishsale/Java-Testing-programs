package String;

public class Occurnece {
	public static void main(String[] args) {
		String str=new String("My name is satipandu");
		int count=0;
		for(int i=str.length()-1;i>0;i--) 
		{
			if((str.charAt(i)=='a'))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
