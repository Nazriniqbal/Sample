package exceptionExp;

public class ThrowExp {
	
	public static void sum(int a,int b)
	{
		int s=a+b;
		if(a>20)
		{
			throw new ArithmeticException("sum is greater than 20");
			
		}
		
		else
		{
			throw new ArrayIndexOutOfBoundsException();
			//System.out.println("sum is less than 20");	
			}
	}
	
	
	
	

	public static void main(String[] args) {
		
		try
		{
			ThrowExp.sum(33,44);	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		System.out.println("rest of code");
		
		}

}
