package stringprogramme;

public class SplitString {
	
	public static void main(String[] args) {
		
		String str = "mahendra rajendra chungde";
		 String[] word = str.split(" ");
		 
		 for(int i=0; i<=word.length-1; i++) {
			 
			 System.out.println(word[i]);
			 System.out.println(word[i].length());
		 }
		
	}

}
