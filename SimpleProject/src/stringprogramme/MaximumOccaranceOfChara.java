package stringprogramme;

public class MaximumOccaranceOfChara {
	
	public static void main(String[] args) {
		 
		String str = "java programming java oops";
		
		int totalcnt = str.length();
		
		System.out.println(totalcnt);
		
		int totalcnt_Afterremove = str.replace("a", "").length();
		
		int count = totalcnt-totalcnt_Afterremove;
		
		System.out.println("number of occurances of a is : " +count);
		
	}
	
	

}
