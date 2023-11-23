package String;

public class Wordcount {
	public static void main(String[] args) {
		String str=new String("My name is Satipandu");
		int count=1;
		for(int i=str.length()-1;i>0;i--) 
		{
			if((str.charAt(i)==' ')&&(str.charAt(i-1)!=' '))
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
