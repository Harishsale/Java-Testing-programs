package Alltasks;

public class parameterized {
		
		int empid; 
		String empname; 
		public  parameterized(int id, String name){ 
		empid = id ; 
		empname = name; 
		}
		public static void main (String [] args){
		parameterized pd = new parameterized(1129,"Harish");
		System.out.println(pd.empid+" "+pd.empname);
		}
	
}
