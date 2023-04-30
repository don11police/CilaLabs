package stringprogramme;

public class FindDuplicateWord {
	
	
	public static void main(String[] args) {
		
		  String str = "Big black bug bit a big black dog on his big black nose";  
		  
		  int cnt = 0;
		  
		  String low = str.toLowerCase();
		 String[] word = str.split(" ");
		 
		 System.out.println("Duplicate words in given string : ");
		
		 for(int i=0; i<=word.length; i++) {
			 
			 
			 for(int j=i+1; j<=word.length; j++) {
				 
				 if(word[i].equals(word[j]))
				 {
					 cnt++;
					 word[j]= "0";
					 
				 }
				 
			 }
			 
			 if(cnt>1 && word[i]!= "0") 
				 	 
			 System.out.println(word[i]);
			 
		 }
		
	}

}
