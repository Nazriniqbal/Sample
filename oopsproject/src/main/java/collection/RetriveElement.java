package collection;

import java.util.ArrayList;

public class RetriveElement {

	public static void main(String[] args) {

		ArrayList<String> list=new ArrayList<String>();
		list.add("red");
		list.add("blue");
		list.add("green");
		list.add("orange");
		list.add("white");
		list.add("black");
		list.add("yellow");
		list.add("purple");
		
		System.out.println("a.print color collection");
		System.out.println(list);
		
		int i=2;
		
		if(i>=0&& i<list.size())
		{
			String s=list.get(i);
			System.out.println("element at index "+ i + " : "+s);
			
		} else
		{
			System.out.println("index is out of bounds");
		}
		

	}

}
