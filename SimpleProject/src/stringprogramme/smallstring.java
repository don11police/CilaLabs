package stringprogramme;

public class smallstring {
	
	public static void main(String[] args) {
		
		String str = "manual and automation testing";
		String[] word = str.split(" ");
		
		for(int i=0; i<=word.length-1; i++) {
			
			System.out.println(word[i].length());
			
			
			String cap = word[i];  
			
		String capital = cap.substring(0, 2)+cap.substring(2, 3).toUpperCase()+cap.substring(3, cap.length());
		System.out.println(capital);
		
		}
		
	
	
		
		
		
		
	}

}
