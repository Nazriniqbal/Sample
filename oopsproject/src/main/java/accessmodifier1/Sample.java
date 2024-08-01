package accessmodifier1;

public class Sample {
  protected	 int a=6;
  protected	 void view()
	{
		System.out.println("value is: "+a);
	}

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.view();

	}

}
