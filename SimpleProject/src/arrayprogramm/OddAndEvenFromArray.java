package arrayprogramm;

public class OddAndEvenFromArray {
	
	public static void main(String[] args) {
		
		int arr[]=new int[]  {85,45,21,641,258,265,156,16,54,13,24,13,476,132};
		
		System.out.println("odd numbers are");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2!=0) {
				
				System.out.println(arr[i] +" ");
			}
		}
		
System.out.println("even numbers are");
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]%2==0) {
				
				System.out.println(arr[i] +" ");
		
			}
	}

}}
