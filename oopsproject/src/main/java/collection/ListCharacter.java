package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListCharacter {

	public static void main(String[] args) {
		
		ArrayList<Character> list1=new ArrayList<Character>();
		list1.add('1');
		list1.add('a');
		list1.add('2');
		list1.add('b');
		list1.add('3');
		list1.add('c');
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
		
		System.out.println("get location of elementfour in list1");
		System.out.println(list1.get(4));
		
		System.out.println("replace");
		list1.set(6,'4');
		System.out.println(list1);
		
		System.out.println("for loop");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		System.out.println("for each loop");
		for(Character i:list1)
		{
			System.out.println(i);
		}
		
		System.out.println("iterator");
		Iterator <Character> it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println(list1);
		it.remove();
		System.out.println(list1);
		

	}

}
