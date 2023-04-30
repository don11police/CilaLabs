
package arrayprogramm;

import java.util.Arrays;

public class ArrayInAscDsc {

	public static void main(String[] args) {
		
		int arr[] = {43,435,234,344,566,874,5234,5456,8778,57568,3546,67867,43,524,34,25,345,6,756,7};
		Arrays.sort(arr);
		System.out.println(arr.length);
		
		System.out.println("Arrays in Asc order");
		for(int i=0; i<=arr.length-1; i++) {
			System.out.println(arr [i]);
			
		}
		
		System.out.println("Arrays in Dsc order");
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		
		
		
		
	}
	
}
