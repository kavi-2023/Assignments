package week3.day2;

public class Palindrome {
	
	public static void main(String[] args) {
		
	
	String str="madam";
	
	char[] ch=str.toCharArray();
	
	String rev="";
			
	for(int i=str.length()-1;i>=0;i--) {
		 
		     rev=rev+ch[i];
		
	}
       System.out.println(rev);
       
       if(rev.equals(str)) {
    	   
    	   System.out.println("It is Palindrome!");
       }
       
       else {
    	   
    	   System.out.println("Not Palindrome");
    	   
       }
}
}