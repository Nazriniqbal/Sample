package abstractclass;

public class Hdf extends Bank{
	
	public void interest()
	{
		System.out.println("implemention of bank hdf interest is 65%");
	}

	public static void main(String[] args) {
		
		Hdf obj=new Hdf();
		obj.interest();
		
		Icici obj1=new Icici();
		obj1.interest();
		
		FederalBank obj2=new FederalBank();
		obj2.interest();
		
		

	}

}
