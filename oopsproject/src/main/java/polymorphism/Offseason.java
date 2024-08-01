package polymorphism;

public class Offseason extends CustomerPurchase{
	double price=1000;
	public void discount()
	{
		price = price * 0.15;
		System.out.println("Offseason discount price :"+price);
		
	}

}
