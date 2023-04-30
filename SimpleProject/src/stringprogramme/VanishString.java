package stringprogramme;

public class VanishString {
	
	public static void main(String[] args) {
		
		String str = "Mahendra chungde";
		
		String[] word = str.split("");
		
		for(int i=0; i<word.length-1; i=i+2) {
			
			System.out.print(word[i]);
		}
		
	}
	

}
