package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
		list.add("git clone");
		list.add("git pull");
		list.add('A');
		list.add(20.20f);
		list.add(1000);
		list.add('A');
		list.add(null);
		System.out.println(list);
	System.out.println(list.isEmpty());
	System.out.println(list.size());
	System.out.println(list.contains('A'));
	
	System.out.println(list.remove(20.20f));
	
	System.out.println(list);
	
	list.pollFirst();
	list.add(3, "git push");
	System.out.println(list);
	
	list.add(2, "git checkout -b");
	System.out.println(list);
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		Collections.reverse(list);
		System.out.println(list);
		
		
	}
	

}
