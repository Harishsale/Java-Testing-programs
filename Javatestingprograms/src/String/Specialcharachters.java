package String;

public class Specialcharachters {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("s&@at$i%s&h");
		String str1="";
	
        for (int i = 0; i < str.length(); i++) {
 
           
            if (!Character.isDigit(str.charAt(i))
                && !Character.isLetter(str.charAt(i))
                && !Character.isWhitespace(str.charAt(i))) {
                
            str.deleteCharAt(i);
            }
        }
        System.out.println(str);
	
	}

}
