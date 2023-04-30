package stringprogramme;

import java.util.LinkedHashSet;

public class PrintDuplicateString {
	
	public static void DuplicateString(String str) {
		
		LinkedHashSet <Character> set = new LinkedHashSet<>();
		
		for(int i=0; i<str.length(); i++) 
			
		
		set.add(str.charAt(i));
		
		for(Character ch : set) 
			
			System.out.print(ch);
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		String str = "manual and";
		
		DuplicateString(str);
		
	}

}
