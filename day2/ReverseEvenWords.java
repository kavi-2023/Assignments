package week3.day2;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		String[] split=test.split(" ");
				
		char ch;
						
		for (int i = 0; i < split.length; i++) {
					
			
			if(i%2==0) {
				
				String str1="";				
											 
				for (int j = 0; j < split[i].length(); j++) {
					
					ch=split[i].charAt(j);
				    str1=ch+str1;
				   
			}
				split[i]=str1;
				
			}
			
		
			System.out.print(split[i]+" ");
		}
		
	}
}


