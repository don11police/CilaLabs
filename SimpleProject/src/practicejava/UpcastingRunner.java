package practicejava;

public class UpcastingRunner {
	
	public static void main(String[] args) {
		
		UpcastingSon son = new UpcastingSon();
		
		son.laptop();
		son.charger();
		son.car();
		son.house();
		son.mobile();
		
		UpcastingFather father = new UpcastingFather();
		
		father.car();
		father.house();
		father.mobile();
		
	 
		
		
	}
	

}
