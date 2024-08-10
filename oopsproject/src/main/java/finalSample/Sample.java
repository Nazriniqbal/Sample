package finalSample;

public class Sample {
	
	final int a=30;   //  a is value constant 
	//a=9;
	final int b;//blank final variable or uninitialized final variable
	
	public Sample()
	{
		b=9;
	}
    public final void display()
    {
    	System.out.println("final");
    }
}
