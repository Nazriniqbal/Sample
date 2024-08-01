package abstractclass;

public class Test extends Demo {
	
	public void show()
	{
		System.out.println("implemention of abstract method");
	}
	
	public void display()
	{
		System.out.println("display method of child class");
	}

	public static void main(String[] args) {
		
     Test obj=new Test();
     obj.show();
     obj.print();
     obj.display();
     
	}

}
