package basicJavaProgramme;

public class Swapping2Numbers {
	
	public static void main(String[] args) {
		
		int a=10, b=20;
		
		System.out.println("before swapping .." +a+"  "+b);
		
		// logic1 third variable
		/*int t=a;
		a=b;
		b=t;
		
		System.out.println("After swapping values are.."+a+" "+b); */
		
		//logic2 use + & - without using third variable
		
		/*a=a+b; //10+20 = 30
		
		b=a-b; //30-20 = 10
		a=a-b;  //30-10 = 20
		
		
		
		System.out.println("After swapping values are.."+a+" "+b); */
		
		//logic3 without using third variable
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("After swapping vallues are.."+a+" "+b);
		
	}
	

}
