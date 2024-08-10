package interfacepgm;

public class Dog implements Animal {
	
	public void bark()
	{
	System.out.println("implements animal is Dog");
	}
	
	public void speak()
	{
		System.out.println("Dog is barking.....");
	}

	public static void main(String[] args) {
		
		Animal obj=new Dog();
		obj.bark();
		obj.speak();
	

	}

}
