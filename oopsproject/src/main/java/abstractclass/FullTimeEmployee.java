package abstractclass;

public class FullTimeEmployee extends Employee {
	
	int   paymentPerHour=150;
	
	public void CalculateSalary()
	{
	int salary=paymentPerHour * 8;	
	System.out.println("full time employee salary is : "+salary);
	}

}
