package abstractclass;

public class Triangle extends Shape{
	
	int a=4,b=5,c=6,h=8;
	
	public void calculateArea()
	{
		System.out.println("implemention of Shape class Calculate Area of triangle");
	    int area=(h*b)/2;
	    System.out.println("area of triangle : "+area);
	}

	public void perimeter()
	{  
	   System.out.println("implemention of Shape class calculate perimeter of triangle");
	   int p=a+b+c;
	   System.out.println("perimeter of triangle : "+p);
	}

}
