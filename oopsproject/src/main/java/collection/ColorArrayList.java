package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ColorArrayList {

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
		
		System.out.println("a.To print color collection");
		System.out.println(list);
		
		System.out.println("b.To retrieve an element at index in array list");
        int i=2;
		if(i>=0&& i<list.size())
		{
			String s=list.get(i);
			System.out.println("element at index "+ i + " : "+s);
			
		} else
		{
			System.out.println("index is out of bounds");
		}
		
		System.out.println("c.To iterate through all elements in a array list");
		Iterator <String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
        System.out.println("d.To remove the third element from a array list");
		list.remove(3);
		System.out.println(list);
	    
	    System.out.println("e.To search an element in a array list");
		System.out.println(list.contains("purple"));
	 }

}
