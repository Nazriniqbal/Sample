package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class FloatList {

	public static void main(String[] args) {
		
		ArrayList<Float> list1=new ArrayList<Float>();
		list1.add(4.6f);
		list1.add(2.6f);
		list1.add(6.6f);
		list1.add(8.6f);
		list1.add(6.6f);
		list1.add(6.2f);
		list1.add(null);
		list1.add(null);
        System.out.println(list1);
		
        System.out.println("remove");
		list1.remove(5);
	    System.out.println(list1);
        
	    System.out.println("list1 is Empty");
		System.out.println(list1.isEmpty());
		
		System.out.println("list1 size");
		System.out.println(list1.size());
		
		System.out.println("get location of elementseven in list1");
		System.out.println(list1.get(6));
		
		System.out.println("replace");
		list1.set(5,2.2f);
		System.out.println(list1);
		
		System.out.println("for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("for each loop");
		for(Float i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("iterator");
		Iterator <Float> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list1);
		it.remove();
		System.out.println(list1);
		

	}

}
