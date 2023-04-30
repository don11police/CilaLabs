package collection;

public class StaticClassVeriable {
	
	static int num = 250;  //Declaring variable with static keyword is know a static or class variable.
	
	public void c1() {
		
		System.out.println(StaticClassVeriable.num);
		
	}
	
	public static void main(String[] args) {
		
		StaticClassVeriable ve = new StaticClassVeriable();
		
		ve.c1();
		
 		
	}
	

}
