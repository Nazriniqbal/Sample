package inhertance;

public class Tester extends Employee {
	
	String rank="second";
	public void view()
	{
		System.out.println("tester rank is: "+rank);
	}

	public static void main(String[] args) {
		
      Tester t=new Tester();
      t.details();
      t.view();
	}

}
