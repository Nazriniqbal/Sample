package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SampleList {

	public static void main(String[] args) {
		
		List <String> list1= new ArrayList<String>();
		list1.add("apple");
		list1.add("orange");
		list1.add("banana");
		list1.add("mango");
		list1.add("mango");
		list1.add(null);
		list1.add(null);
		System.out.println(list1);
		
		
		
		
		System.out.println("non generic collection");
		
		ArrayList list2=new ArrayList();
		list2.add(12);
		list2.add(12.6f);
		list2.add(2334.667d);
		list2.add("hello");
		System.out.println(list2);
		
		System.out.println("generic collection");
		
		
		ArrayList<String> list3=new ArrayList<String>();
		list3.add("nazrin");
		list3.add("rashid");
		list3.add("zahra");
		list3.add("umar");
		System.out.println(list3);
		
		System.out.println("remove");
		
		list1.remove(2);
		
	    System.out.println(list1);
	
		list2.remove("hello");
		
		System.out.println(list2);
		
		System.out.println("is Empty");
		
		System.out.println(list1.isEmpty());
		
		System.out.println("size");
		
		System.out.println(list1.size());
		
		System.out.println("get location element");
		
		System.out.println(list1.get(1));
		
		System.out.println("replace");
		
		list1.set(2,"grapes");
		
		System.out.println(list1);
		
		System.out.println("for loop");
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("for each loop");
		
		for(String i:list1)
		{
			System.out.println(i);
		
		}
		
		System.out.println("iterator");
		Iterator <String> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			
		}
		System.out.println("iterator");
		it.remove();
		System.out.println(list1);
		
		System.out.println("Add All");
		list1.addAll(list3);
		System.out.println(list1);
		
		System.out.println("Remove All");
		list1.removeAll(list3);
		System.out.println(list1);
		
		System.out.println("sorted elements");
		Collections.sort(list3);
		System.out.println(list3);
		
		System.out.println("contains");
		System.out.println(list3.contains("rashid"));
		
		
		
		}
	
}
