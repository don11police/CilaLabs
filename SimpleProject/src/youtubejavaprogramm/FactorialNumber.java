package youtubejavaprogramm;

public class FactorialNumber {
	
	public static void main(String[] args) {
		
		int number = 5, fact = 1;    //5! = 5*4*3*2*1 = 120
		
		for(int i=1; i<=number; i++) {
			
			fact = fact*i;
		}
		
		System.out.println("factorial of 5 is :-"+fact);
	}

}
