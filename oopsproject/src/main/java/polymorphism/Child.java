package polymorphism;

public class Child extends Parent{
public void sum(int c,int d) {
	
	int s=c+d;
	System.out.println("child sum"+s);
	super.sum(10,30);
}
	public static void main(String[] args) {
		Child cd=new Child();
		cd.sum(30,30);

	}

}
