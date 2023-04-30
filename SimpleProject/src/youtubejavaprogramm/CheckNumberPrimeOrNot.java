package youtubejavaprogramm;

public class CheckNumberPrimeOrNot {
	
	public static void main(String[] args) {  //number which is divisible by number 1 or itself
		
		int number = 11;
		int temp = 0;
		
		for(int i=2; i<=number/2; i++) {
			
			if(number%i==0) {
				temp=temp+1;
				break;
			}
			
			
		}
		if(temp==0) {
			System.out.println("number is prime");
			
		}
		else {
			
			System.out.println("number is not prime");
		}
		
	}

}
