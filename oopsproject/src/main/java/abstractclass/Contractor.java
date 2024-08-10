package abstractclass;

public class Contractor extends Employee {
	int paymentPerHour=100,workingHour=40;
	public void  CalculateSalary()
	{
	 int salary=paymentPerHour * workingHour ;	
	 System.out.println("contractor salary is : "+salary);
	}

	public static void main(String[] args) {
		
		Contractor obj=new Contractor();
		obj.CalculateSalary();
		
		FullTimeEmployee obj1=new  FullTimeEmployee();
		obj1.CalculateSalary();

	}

}
