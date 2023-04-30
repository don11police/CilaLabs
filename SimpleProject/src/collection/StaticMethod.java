package collection;

public class StaticMethod {
	
	public static void test1() {
		
		System.out.println("fb working as per expected");
	}
	
	public static void test2() {
		
		System.out.println("twitter is working as per expected");
	}
	
	public void test3() {
		
		System.out.println("instagram acc opne");
	}

	
public static void main(String[] args) {
		
		test1();
		test2();
	StaticMethod call = new StaticMethod();
	call.test3();
	
		
}
}
