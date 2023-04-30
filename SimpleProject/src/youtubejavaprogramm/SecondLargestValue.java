package youtubejavaprogramm;

public class SecondLargestValue {
	
	public static void main(String[] args) {
		
	
	
	int arr [] = new int[] {85,45,21,641,258,265,156,16,54,13,24,13,476,132};
	
	int temp =0;
	
	for(int i=0; i<arr.length; i++) {
		for(int j=i; j<arr.length; j++ ) {
			
			if(arr[i]<arr[j]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		
		
	}
	System.out.println("second largest value "+arr[1]);

}
}
