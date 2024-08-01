package inhertance;

public class SalaryDetails extends EmployeeDetails {
	 double hra;
	 double pf;
	 public void calculate()
	 {
		 hra=0.05*basicpay;
		 pf=0.20*basicpay;
		 
	 }

	public static void main(String[] args) {
		SalaryDetails sd=new SalaryDetails();
		sd.details();
		sd.calculate();

	}

}
