package polymorphism;

public class Onseason extends CustomerPurchase{
	double price=1000;
	
	public void discount()
	{
	price =price * 0.4;
	System.out.println("Onseason discount price :"+price);
	}

	public static void main(String[] args) {
		CustomerPurchase cp=new CustomerPurchase();
		cp.discount();
		cp=new Offseason();
		cp.discount();
		cp=new Onseason();
		cp.discount();

	}

}
