package collection;

public class GlobalVeriable {
	
	String str = "java programming";
	String name = "new java";
	
	public void m1() {
		
		System.out.println("global veriable in m1 " + str);
		
	}
	
	public void m2() {
		
		System.out.println("global veriable in m2 " +name);
	}
	
	public static void main(String[] args) {
		
		
		GlobalVeriable glo = new GlobalVeriable();
		
		glo.m1();
		glo.m2();
		
	}
	

}
