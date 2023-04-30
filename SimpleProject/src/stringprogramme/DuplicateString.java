package stringprogramme;

public class DuplicateString {
	
	
	public static void main(String[] args) {
		
		String str = "manual testing";
		
		
		char[] duplicate = str.toCharArray();
		
		System.out.println("the string is " +str);
		System.out.println("duplicate string char in above string are: ");
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				
				if(duplicate[i]==duplicate[j]) {
					
					
					System.out.print(duplicate[j] + " ");
					
					break;
				}
			}
		}
		
		
		
		
	}

}
