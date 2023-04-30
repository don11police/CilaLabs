package arrayprogramm;

import java.util.Arrays;

public class MaxandMinValueFromArray {
	
	  public static void main(String[] args) {
		
		  int [] arr = {21,34,34,3,54,356,6,23,343,456};
		  
		
		  
		 int Max = Arrays.stream(arr).max().getAsInt();
		 System.out.println("maximum value is " + Max);
		  
		  int min = Arrays.stream(arr).min().getAsInt();
		  System.out.println("minimum value is " +min);
		  
		 
		  
	}
	

}
