package collections;

import java.util.HashSet;
import java.util.Set;


public class PrintUniqueCharacter {
	
	public static void main(String[] args) {
		
		String s="babu";
		
		char[] ch=s.toCharArray();
		
		Set<Character> set=new   HashSet<Character>();
		
		
		 for (int i = 0; i < ch.length; i++) {
			 
			   	if(!set.contains(ch[i])) {
		    		
		    		set.add(ch[i]);
			   	}	
		    	
		    	else {  
		    		
		    	  	    set.remove(ch[i]);
		    	 
		      }
			   			
			}	 
		 
		 System.out.println(set);
			
			  
		 }
	
}
			
		  
			
			
			
		
	


