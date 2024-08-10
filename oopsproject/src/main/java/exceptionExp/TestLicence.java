package exceptionExp;

public class TestLicence {
	public static void validate(int age)throws LicenceException
	{
		if (age<18)
		{
			throw new LicenceException("not eligible for licence");
		}
		else
		{
			System.out.println("Eligible for licence");
		}
	}

	public static void main(String[] args)
	{
	try 
	{
		TestLicence.validate(17);
		
	 }
	catch(LicenceException e)
	{
		System.out.println(e);
	}
	
	System.out.println("rest of the code");

	}

}
