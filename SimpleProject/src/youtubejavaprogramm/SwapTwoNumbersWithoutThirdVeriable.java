package youtubejavaprogramm;

public class SwapTwoNumbersWithoutThirdVeriable {
	
	
	public static void main(String[] args) {
		
		int n1=20;
		int n2=30;
		
		System.out.println("numbers without swapping "+n1+" "+n2);
		
		n1=n1+n2;  //20+30 = 50
		n2=n1-n2; // 50-30 = 20
		n1=n1-n2; // 50-20 = 30
		
		System.out.println("numbers after swapping "+n1+ " "+n2);
		
		
	}

}
