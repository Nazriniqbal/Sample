package collection;

import java.util.ArrayList;

public class ListArrayC {

	public static void main(String[] args) {

		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(null);
		
		for(Integer i:list)
		{
			System.out.println(i);
		}
		
		

	}

}
