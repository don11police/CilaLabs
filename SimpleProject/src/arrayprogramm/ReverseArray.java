package arrayprogramm;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		int arr [] = new int[] {3,7,1};
		
		System.out.println("Array in reverse order");
		
		for(int i=arr.length-1; i>=0; i--) {
			
			System.out.print(arr[i] +" ");
			
		}
		
		
	}
	

}
