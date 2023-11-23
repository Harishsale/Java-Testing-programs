package Encapsulation;

public class Employee {
	
	private int empid;
	private String empname;
	
	public void setempid(int id) 
	{
		empid=id;
		System.out.println("Employee id " +empid);
	}
	public int getempid()
	{
		return empid;
	}
	
	public void setempname(String name)
	{
		empname=name;
		System.out.println("Employee name " +empname);
	}
	public String getempname()
	{
		return empname;
	}

}
