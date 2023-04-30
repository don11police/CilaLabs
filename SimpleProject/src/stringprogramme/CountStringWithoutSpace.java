package stringprogramme;

public class CountStringWithoutSpace {
	
	public static void main(String[] args) {
		
		String str = "learn java today";
		
		System.out.println("length of string considering space :"+str.length());
		
		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)!=' ') {
				
				count++;
			}
		}
		
		System.out.println("count of charcter without considering space :-"+ count);
		
	}

}
