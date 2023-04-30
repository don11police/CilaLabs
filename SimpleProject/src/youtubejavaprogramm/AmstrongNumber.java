package youtubejavaprogramm;

public class AmstrongNumber {
	
	public static void main(String[] args) {
		
		int num =153, result=0, rem;
		int temp=num;
		
		while(num>0) {
			
			rem=num%10;
			num=num/10;
			result=result+(rem*rem*rem);
			
		}
		if(result==0) {
			
			System.out.println("number is amstrong");
		}
		else {
			System.out.println("number is not amstrong");
		}
		
		
	}
	
	

}
