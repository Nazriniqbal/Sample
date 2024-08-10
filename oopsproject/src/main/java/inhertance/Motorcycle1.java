package inhertance;

public class Motorcycle1 extends Vehicle1{
	
	public void startEngine()
	{
		System.out.println("motorcycle engine is start");
	}
	public void stopEngine()
	{
		System.out.println("motorcycle engine is stop");
	}
	
	public static void main(String[] args) {
		
		Motorcycle1 obj=new Motorcycle1();
		obj.startEngine();
		obj.stopEngine();
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		Car1 ob=new Car1();
		ob.startEngine();
		ob.stopEngine();
		
	}

}
