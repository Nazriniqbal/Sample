package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListInterger {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(12);
		list1.add(22);
		list1.add(32);
		list1.add(42);
		list1.add(62);
		list1.add(62);
		list1.add(null);
		list1.add(null);
        System.out.println(list1);
		
        System.out.println("remove");
		list1.remove(2);
	    System.out.println(list1);
        
	    System.out.println("list1 is Empty");
		System.out.println(list1.isEmpty());
		
		System.out.println("list1 size");
		System.out.println(list1.size());
		
		System.out.println("get location of elementone in list1");
		System.out.println(list1.get(1));
		
		System.out.println("replace");
		list1.set(2,66);
		System.out.println(list1);
		
		System.out.println("for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("for each loop");
		for(Integer i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("iterator");
		Iterator <Integer> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list1);
		it.remove();
		System.out.println(list1);
		
		
		

	}

}
