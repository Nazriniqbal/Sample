package interfacepgm;

public  class Hdfc implements Rbi
{

	
	public double recurringDeposite(double amount,int duration)
	{
	System.out.println("deposit amount : "+amount);
	System.out.println("duration in years : "+duration);
	
	double totalAmount=	amount * (1+ INTEREST_RATE * duration);
	
	return totalAmount;
	}

	public static void main(String[] args)
	{
		Rbi obj=new Hdfc();
		System.out.println(" total amount : "+obj.recurringDeposite(10500.0,2));
		
	}

}
