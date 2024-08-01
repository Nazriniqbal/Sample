package encapsulation;

public class EmployeeDetails {
	private String name;
	private String designation;
	private int salary;
	
	public void setter(String name,String designation,int salary)
	{
		this.name=name;
		this.designation=designation;
		this.salary=salary;
		
	}
	
	public void getter()
	{
		System.out.println("name : "+name);
		System.out.println("designation : "+designation);
		System.out.println("salary : "+salary);
	}
	

}
