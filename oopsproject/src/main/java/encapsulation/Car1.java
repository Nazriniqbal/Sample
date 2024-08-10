package encapsulation;

public class Car1 extends Car{

	public static void main(String args[])
	{
		Car1 obj=new Car1();
		
		System.out.println("company name : "+obj.getCompany_name());
		System.out.println("model name : "+obj.getModel_name());
		System.out.println("year : "+obj.getYear());
		System.out.println("mileage : "+obj.getMileage());
		
		obj.setCompany_name("honda");
		obj.setModel_name("civic");
		obj.setYear(2022);
		
		System.out.println("updated company name : "+obj.getCompany_name());
		System.out.println("updated model name : "+obj.getModel_name());
		System.out.println("updated year : "+obj.getYear());
		System.out.println("mileage : "+obj.getMileage());
		
	}

	

}
