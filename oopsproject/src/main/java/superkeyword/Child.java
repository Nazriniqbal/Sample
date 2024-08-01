package superkeyword;

public class Child extends Parent{
	int a=10;
	public void display()
	{
		
		super.display();
		super.show();
		System.out.println("child class method");
		System.out.println(a);
		System.out.println(super.a);
	}
	public  Child()
	 {
		 super();
		 System.out.println("child constructor");
	 }


	public static void main(String[] args) {
	   Child c=new Child();
	   c.display();
	  

	}

}
