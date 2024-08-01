package aggregation;

public class Book {
	int bookid;
	String bname;
	Author a;
	
	public Book(int bookid,String bname,Author a)
	{
		this.bookid=bookid;
        this.bname=bname;
		this.a=a;
	}

	public void display()
	{
	System.out.println("book id: "+bookid);
	System.out.println("book name : "+bname);
	System.out.println("Author name : "+a.aname);
	System.out.println("which type : "+a.type);
	System.out.println("age :"+a.age);
	}
	public static void main(String args[]) {
		Author obj=new Author("shashi","drama",45);
		Book ob=new Book(1278,"pinkibook",obj);
		ob.display();
		
	}
}
