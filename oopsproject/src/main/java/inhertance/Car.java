package inhertance;

public class Car  extends Vehicle {
	int b=10;
	public void display()
	{
		System.out.println("car number is:");
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.print();
		c.display();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
