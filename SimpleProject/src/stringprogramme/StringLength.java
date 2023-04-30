package stringprogramme;



public class StringLength {
	
	public static void main(String[] args) {
		
		String str = "Mahendra Rajendra Chungde";
		System.out.println(str.length());
		
		int cnt = 0;
		
		
		for(int i=0; i<=str.length()-1; i++) {
			System.out.print(str.charAt(i));
			cnt++;
			
		}
		System.out.println("cnt "+cnt);
		System.out.println(cnt);
		
			
		
	for(int i=str.length()-1; i>=0; --i) {
		System.out.println(str.charAt(i));
		
		
		
	}

}
}
