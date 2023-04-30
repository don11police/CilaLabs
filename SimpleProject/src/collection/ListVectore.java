package collection;

import java.util.Vector;

public class ListVectore {
	
	public static void main(String[] args)  {
		
	   Vector vtr = new Vector();
	   
	   System.out.println(vtr.capacity());
	   System.out.println(vtr.isEmpty());
	   System.out.println(vtr.size());
	   
	   vtr.add("abc");
	   vtr.add(20);
	   vtr.add('a');
	   vtr.add(20.8f);
	   vtr.add(null);
	   vtr.add("abcd");
	   
	   
	   System.out.println(vtr);
	   
	   System.out.println(vtr.lastIndexOf(null));
	   
	   System.out.println(vtr.indexOf(null));
	   
	   System.out.println(vtr.remove(4));
	   
	  vtr.removeElementAt(3);
	  System.out.println(vtr);
	  
	  System.out.println(vtr.get(2));
	  System.out.println(vtr.contains("java"));
	    
	  
	    
	    
	    
		
	 
		
		
	}
	

}
