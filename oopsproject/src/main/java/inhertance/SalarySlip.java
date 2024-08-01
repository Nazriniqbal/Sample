package inhertance;

public class SalarySlip extends SalaryDetails {
	double totalsalary;
	
	public void calculateTotalSalary()
	{
		totalsalary=basicpay+hra-pf-deduction+bonus;
		
	}
	public void printSalarySlip()
	{
		System.out.println("basic pay :"+basicpay);
		System.out.println("deduction :"+deduction);
		System.out.println("bonus :"+bonus);
		System.out.println("hra :"+hra);
		System.out.println("pf :"+pf);
		System.out.println("total salary :"+totalsalary);
		
	}

	public static void main(String[] args) {
		
		SalarySlip ss=new SalarySlip();
		ss.details();
		ss.calculate();
		ss.calculateTotalSalary();
		ss.printSalarySlip();

	}

}
