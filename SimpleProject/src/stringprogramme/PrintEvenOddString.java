package stringprogramme;

public class PrintEvenOddString {
	
	public static void main(String[] args) {
		
		String str = "abc xpf we sfdkdf dsfg wet4 wedsfr sfdsd ewd";
	    System.out.println(str.length());
	   String[] word = str.split(" ");
	    
	    for(int i=0; i<=word.length-1; i=i+2) {
	    	System.out.println("Even string are :" +word[i]);
	    	
	    }
	    
	    for(int i=1; i<=word.length-1; i=i+2) {
	    	System.out.println("odd number are :" +word[i]);
	    	
	    	
	    }
	}

}
