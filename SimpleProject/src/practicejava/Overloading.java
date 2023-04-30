package practicejava;

public class Overloading {
	
	
	public void add(int num1, int num2) {
		
		int addition = num1+num2;
		
		System.out.println("addition of two number :" +addition);
		}
	
	public void add(int num1, float num2) {
		
		float addition = num1+num2;
		
		System.out.println("addition of two numbers " +addition);
		
	}
	
	public static void main(String[] args) {
		
		Overloading over = new Overloading();
		
		over.add(12, 345);
		over.add(23, 25.63f);
		
		
	}

}
