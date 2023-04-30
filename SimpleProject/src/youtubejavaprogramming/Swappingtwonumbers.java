package youtubejavaprogramming;

public class Swappingtwonumbers {
	
	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("before swapping number are" +a+ " " +b);
		
		//logic1 third variable 
		
		/*int t=a;  //10  
		a=b;  //20
		b=t;  //10
		
		System.out.println("value after swapping " +a+ " " +b); */
		
		//logic2 without using third variable
		
		a=a+b;  //10+20 = 30
		b=a-b;  // 30-20 = 10
		a=a-b;  // 30-10 = 20
		
		System.out.println("value after swapping " +a+ " " +b);
		
		//logic3 use * and / without using third variable
		//here value of a and b should not be zero
		
		a=a*b; //10*20 =200 
		b=a/b;  //200/20 = 10
		a=a/b;  // 200/10 = 20
		
		System.out.println("value after swapping " +a+ " " +b);
		
		//logic4 bitwise XOR operator(^)
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("value after swapping " +a+ "" +b);
				
		
		
	}

}
