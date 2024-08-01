package polymorphism;

public class Football extends Games {
	public void play()
	{
		System.out.println("football");
		
	}
	public static void main(String ars[])
	{
		Games g;
	    g=new Football();
		g.play();
		g=new Hockey();
		g.play();
		g=new Cricket();
		g.play();
	}

}
