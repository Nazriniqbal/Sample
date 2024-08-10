package exceptionExp;

public class Sample {

	public static void main(String[] args) {
		
		
		int a=20, b=25;
		int sum=a+b;
		System.out.println("sum : "+sum);
		int arr[]=new int[5];
		
		try {
			arr[9]=76;
			int result=10/0;
		    }
		/*catch(ArithmeticException  e)
		{
			System.out.println("division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index is out bounds");
		}*/
		catch(Exception e)
		{
			System.out.println("parent Exception");
		}
		
		finally
		{
			System.out.println("finally block will alaways executed");
		}
		
	   System.out.println("rest of code");
		
	}

}
