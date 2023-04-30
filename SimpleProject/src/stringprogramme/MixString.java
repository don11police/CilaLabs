package stringprogramme;

public class MixString {
	
	public static void main(String[] args) {
		
		String str = "AB094azcbf8@#3YU$*@TR%";
		
		String special = str.replaceAll("[A-Z 0-9 a-z]", "");
		System.out.println(special);
		
		String chara = str.replaceAll("[@#$%* A-z]", "");
		
		System.out.println(chara);
	}

}
