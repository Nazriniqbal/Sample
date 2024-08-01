package aggregation;

public class Student {
	String name;
	int rollno,std;
	Address add;
	public Student(String name,int rollno,int std,Address add)
	{
		this.name=name;
		this.rollno=rollno;
		this.std=std;
		this.add=add;
		
	}
	public void display()
	{
		System.out.println("name: "+name);
		System.out.println("rollno: "+rollno);
		System.out.println("std: "+std);
		System.out.println("homeno: "+add.homeno);
		System.out.println("homename: "+add.homename);
		System.out.println("place : "+add.place);
		System.out.println("city: "+add.city);
		System.out.println("state: "+add.state);
		
		
		
	}
	
 public static void main(String[] args) {
		Address obj=new Address(1,"nazrinvilla","alamcode","tvm","kerala");
		Student ob=new Student("nazrin",6,12,obj);
		ob.display();

	}

}
