package inhertance;

public class Developer extends Employee {
	int s=10000;
	public void display()
	{
		System.out.println("salary:"+s);
	}
	

	public static void main(String[] args) {
	 
       Developer d= new Developer();
       d.details();
       d.display();
       Tester t=new Tester();
       t.details();
       t.view();
	}

}
