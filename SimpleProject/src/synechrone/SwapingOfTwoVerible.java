package synechrone;

public class SwapingOfTwoVerible {
	
	public static void main(String[] args) {
	
	String a = "Hallo";
	String b = "World";
	System.out.println("before swapping : ");
	System.out.println("the value of a is :" +a);
	System.out.println("the value of b is: " +b);
	

	a=a+b; //HalloWord
	
	//store initial string a in string b
	
	b = a.substring(0, a.length()-b.length());
	
	//store initial string  b in string a 
	
	a = a.substring(b.length());
	
	System.out.println("after swapping value of a and b are");
	System.out.println("the value of a is :" +a);
	System.out.println("the value of b is: " +b); 
	
	
	}

}
