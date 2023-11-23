package Static;

public class Static {
	
	      static int a=100; //static 
	      int b=50; //non-static
	
	      public static void show()  //static method
	      { 
	    	  
	    	  System.out.println("Hello everyone");
	      }
	      
	      public void display() //non static
	      {
	    	  System.out.println("Hii");
	      }
	      
	      public void m1()       //non-static
	      {
	    	  show();  
		      display();
		      System.out.println(a);
		      System.out.println(b);
	      }
	      
	      public static void main(String[] args) {
			
	    	Static sc=new Static();  // without this also we can call directly run 
	    	System.out.println(a); 
	    	//Static st=new Static();
	    	//System.out.println(b); 
	    	  show();  
	    	  sc.display();
	    	
	      }

}
