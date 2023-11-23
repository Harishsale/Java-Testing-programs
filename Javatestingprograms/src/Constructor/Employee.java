package Constructor;

public class Employee 
   {
	int empidnumber;              //0
	String name;           //null
	
	
	//private String empidnumber;
	
	
	public Employee(int id, String names) //this is called constructor
	{
		empidnumber=id;
		name=names;
		
	}
	
	
	
	public static void main(String[] args)
	{
		Employee emp1= new Employee(127, "Harish");
		Employee emp2= new Employee(128, "Satish");
		
		System.out.println(emp1.empidnumber+" "+emp1.name);
		System.out.println(emp2.empidnumber+" "+emp2.name);
				
//		Employee emp1=new Employee();
//		Employee emp2=new Employee();
//		Employee emp3=new Employee();
//		Employee emp4=new Employee();
//		Employee emp5=new Employee();
		
//		System.out.println(emp1.empidnumber+"emp1.name");
//		System.out.println(emp1.empidnumber+"emp2.name");
//		System.out.println(emp1.empidnumber+"emp3.name");
//		System.out.println(emp1.empidnumber+"emp4.name");
//		System.out.println(emp1.empidnumber+"emp.name");
		
		
		
		
	}

	

}
