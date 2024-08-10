package abstractclass;

public class Circle extends Shape{
	
	int r=6;
	
	public void calculateArea()
	{
		System.out.println("implemention of Shape class calculateArea of circle");
		double area=pi*r*r;
		System.out.println("area of circle : "+area);
	}

	public void perimeter()
	{   
		System.out.println("implemention of Shape class calculate perimeter of circle");
		double p =2*pi*r;
		System.out.println("perimeter of circle : "+p);
	}
	
	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.calculateArea();
		c.perimeter();
		
		Triangle t=new Triangle();
		t.calculateArea();
		t.perimeter();
		

	}

}
