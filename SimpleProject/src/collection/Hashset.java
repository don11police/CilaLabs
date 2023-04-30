package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	
	public static void main(String[] args) {
		
		
		HashSet set = new HashSet();
		
		System.out.println(set.isEmpty());
		
		System.out.println(set.size());
		
		set.add("git clone");
		set.add("git pull");
		set.add("git checkout -b feature");
		set.add(20);
		set.add('a');
		set.add(20.58f);
		set.add(20);
		
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		
		System.out.println(set);
		
	Iterator itr = set.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
		set.remove('a');
		set.contains("git clone");
	
		
		System.out.println(set);
	}
		
		
	
		
		
		
	}
	


