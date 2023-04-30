package basicJavaProgramme;

public class PalindromeNumber {

	public static void main(String[] args) {
		
	 int r, sum=0, temp;
	 int A = 121;
	 
	 temp =  A;
	   
	while(A>0) {
		
	
	 r = A%10;
	 sum = (sum*10)+r;
	 A = A/10;
	 
	}
	
	if(temp==sum) {
		System.out.println("palindrome number");
	}
	else {
		System.out.println("not a palindrome number");
	}
	 
	}
	
	
}
