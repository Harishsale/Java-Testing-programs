package practice;

public class Logicaltask {

	public static void main(String[] args) {
		
		int a=10,b=20;
		//Logical AND
		boolean result=((a/b)==b)&&(a>b);
		boolean result1=((a/b)!=b)&&(a<b);
		boolean result2=(b==b)&&(a<b);
		System.out.println("result= "+result);
		System.out.println("result1= "+result1);
		System.out.println("result2= "+result2);
	
		//Logical OR
		boolean res=((a/b)==b)||(a>b);
		boolean res1=((a/b)!=b)||(a<b);
		boolean res2=(b==b)||(a<b);
		System.out.println("res="+res);
		System.out.println("res1="+res1);
		System.out.println("res2="+res2);
		
		//Logical NOT
		boolean r=!((a/b)==b)||(a>b);
		boolean r1=!((a/b)!=b)||(a<b);
		boolean r2=!(b==b)||(a<b);
		System.out.println("r="+r);
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
	
	}

}
