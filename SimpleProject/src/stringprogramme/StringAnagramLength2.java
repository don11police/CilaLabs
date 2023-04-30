package stringprogramme;

import java.util.Arrays;

public class StringAnagramLength2 {
	
	public static void main(String[] args) {
		
		String x = "LiStEn is";
		String y = "SiLenT Is"; 
		
		x = x.replace(" ", "");
		y = y.replace(" ", "");
		
		x = x.toLowerCase();
		y = y.toLowerCase();
		
		
		char[] a = x.toCharArray();
		char[] b = y.toCharArray();
		  
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a, b);
		
		if(result==true) {
			System.out.println("string are anagram");
		}
		else {
			System.out.println("string is not anagram");
		}
		
	}
	

}
