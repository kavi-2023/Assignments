package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		int[] num = {2,6,3,2,4,7,9,10,4,8,3,9,4,1};
		
		Set<Integer> unique=new TreeSet<Integer>();
						
		for (int i = 0; i < num.length; i++) {
								  
					  unique.add(num[i]);
					  
			}
		System.out.println(unique);
		List<Integer> l=new ArrayList<Integer>(unique);
		
		for (int i = 0; i < l.size(); i++) {
			
			  if(l.get(i)!=i+1) {
				  
				  System.out.println( "Missing no:"+ (i+1));
				  break;
				  
			  }
		}
			
	}	
}



	