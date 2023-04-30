package arrayprogramm;

public class FindMaxAndMinArray {
	
	public static void main(String[] args) {
		
	
	int a [] = {45,45,456,456,456,456,45,4,345,63,457,567};

    int max = a[0];
    
    for(int i=0; i<a.length; i++) {
    	
    	if(a[i]>max) {
    		
    		max = a[i];
    		
    	}
    	
    	
    }
	System.out.println("max element is " +max);
	
	int min = a[0];
	for(int i=1; i<a.length; i++) {
		
		if(a[i]<min) {
			
			min = a[i];
		}
		
	}
	System.out.println("min. value of array " +min);
	
	
	}
	


}
