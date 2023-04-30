package arrayprogramm;

public class Secondminvaluefromarray {
	
	public static void main(String[] args) {
		
	
	
	int [] a = {34,45,56,5,8,8,43,24,37,89,23};
	
	int temp;
	
	for(int i=0; i<a.length; i++) {
		for(int j=i; j<a.length; j++) {
			
			if(a[i]>a[j]) {
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	
	System.out.println("second smallest number :" +a[1]);
	
	
	}
}
