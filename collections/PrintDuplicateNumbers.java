package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicateNumbers {
	
	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		Set<Integer> set=new HashSet<Integer>();
				
		for (int i = 0; i < data.length; i++) {
						 		  
				  set.add(data[i]);				  
								  
			  }
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>(set);
		
		for (int i = 0; i <= data.length-1; i++) {
			
			if(list.get(i)==data[i]) {
				
				System.out.println(data[i]);
			}
			
		}
			
		}
		
		
		
	}


