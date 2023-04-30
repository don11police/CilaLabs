package basicJavaProgramme;

public class checkprimenumberornot {
	
	public static void main(String[] args) {
		
		////number which is divisible by number 1 or itself
		
		int A = 859;
		int temp = 0;
		
		for(int i=2; i<=A-1; i++) {
			
			if(A%i==0) {
				
				temp = temp+1;
				
				
			}
		}
		
		if(temp==0) {
			System.out.println(A + " prime number");
		}
		else {
			System.out.println(A + " not a prime number");
		}
		
		
		
	}

}
