package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.setPin(1212);
		System.out.println("pin :"+obj.getPin());
		
		

	}

}
