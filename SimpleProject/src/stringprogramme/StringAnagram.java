package stringprogramme;

import java.util.Arrays;

public class StringAnagram {
	
	public static void main(String[] args) {
		
		String x = "SILENT";
		String y = "LISTEN";
		
		char[] a = x.toCharArray();
		 char[] b = y.toCharArray(); 
		 
		 Arrays.sort(a);
		 Arrays.sort(b); 
		 
		 boolean result = Arrays.equals(a, b);
		 
		 if(result==true) {
			 
			 System.out.println("strings are anagram");
		 }
		 
		 else {
			 System.out.println("strings are not anagram");
		 }
		
		
		
	}
	

}
