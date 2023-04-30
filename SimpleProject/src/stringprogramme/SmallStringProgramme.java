package stringprogramme;

public class SmallStringProgramme {
	
	public static void main(String[] args) {
		
		String S1 = "VELOCITY";
		String S2 = "velocity";
		
		System.out.println(S1.length());
		
		System.out.println(S1.charAt(5));
		
		System.out.println(S2.toUpperCase());
		
		System.out.println(S1.toLowerCase());
		
		System.out.println(S2.indexOf('i')); 
		
		System.out.println(S1.startsWith("LO"));
		
		System.out.println(S2.startsWith("ve"));
		
		System.out.println(S1.equalsIgnoreCase(S2));
		
		System.out.println(S1.equals(S2));
		
		System.out.println(S1.substring(4));
		
		System.out.println(S2.substring(3));
		
		System.out.println(S1.substring(2,6));
		
		
		
		
	}

}
