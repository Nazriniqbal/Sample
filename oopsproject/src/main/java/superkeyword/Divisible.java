package superkeyword;

public class Divisible extends Addition {
	
	public void div()
	{
		int result=super.add(15,24);
		System.out.println("the addition sum is :"+super.sum);
		
		if(result % 10==0)
		{
			System.out.println("is divisible by 10");
		}
		else
		{
			System.out.println("is not divisible by 10");
		}
		
		
	}

	public static void main(String[] args) {
		
		
		Divisible obj=new Divisible();
		obj.div();
		}

}
