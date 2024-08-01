package encapsulation;

public class Employee {

	public static void main(String[] args) 
	{
	
		EmployeeDetails obj=new EmployeeDetails();
		obj.setter("nazrin", "software tester", 50000);
        obj.getter();
	}

}
