package arrayprogramm;

public class DuplicateElementInarray {

	public static void main(String[] args) {
		
		int arr [] = new int [] {3,5,3,5,4};
		
		System.out.println("Duplicate number in array");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println(arr[j]);
				}
			}
			
		}
		
	}
	
}
