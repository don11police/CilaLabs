package arrayprogramm;

public class SecondLargestValuefromArray {
	
	public static void main(String[] args) {
		int []a = {34,2,34,454,56,46,45,234,56,78,};
		
		int temp;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i; j<a.length; j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		System.out.println("second largest element is :" +a[1])
		;
		
		
	}
	

}
