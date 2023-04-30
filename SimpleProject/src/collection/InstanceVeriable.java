package collection;

public class InstanceVeriable {
	
	
 int num = 250;  //Declaring variable without static keyword is know a non-static or instance variable.
	
	public void c1() {
		
		System.out.println(StaticClassVeriable.num);
		
	}
	
	public static void main(String[] args) {
		
		StaticClassVeriable ve = new StaticClassVeriable();
		
		ve.c1();
		
 		
	}
	
	



}
