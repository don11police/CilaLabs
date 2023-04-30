package stringprogramme;

public class CountVowelsConsonant {
	
	public static void main(String[] args) {
		
		int vcount=0, ccount = 0;
		
		String str = "learn java today";
		
	    for(int i=0; i<str.length(); i++) {
	    	
	    	if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='u' || str.charAt(i)=='o') {
	    	
	    	vcount ++;
	    	}
	    
	    
	    else if(str.charAt(i)>='a' && str.charAt(i)<='z') {
	    	ccount++;
	    }
	    	
	    }
	    
	    System.out.println("count of vowels " +vcount);
	    System.out.println("count of ccount " +ccount);
		
		
	}

}
