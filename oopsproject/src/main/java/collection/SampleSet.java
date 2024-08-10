package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleSet {

	public static void main(String[] args) {
		
		Set<String> s=new HashSet<String>();
		s.add("nazrin");
		s.add("rashid");
		s.add("zahra");
		s.add("umar");
		s.add("nazrin");
		s.add(null);
		
		System.out.println(s);
		
		HashSet s1=new HashSet();
		
	s1.add(12);
	s1.add("orange");
	
	System.out.println(s1);
	
	HashSet <String> s2=new HashSet<String>();
	s2.add("najuma");
	s2.add("iqbal");
	
	System.out.println(s2);
		
	s.remove("nazrin");
	
	System.out.println(s.size());
	
	System.out.println(s);
	
	System.out.println(s.contains("zahra"));
	
	Iterator<String> it=s.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	s1.addAll(s2);
	System.out.println(s1);
	
	s1.removeAll(s2);
	System.out.println(s2);
	
	
	
	
	
	
	
	
		
		
		
	}

}
