package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	
	public static void main(String[] args) {
		
		String[] str= {"CTS","Aspire Systems","Wipro","HCL"}; 
		int length=str.length;
		System.out.println(length);
		
		List<String> strlist=new ArrayList<String>();
		
		for (String string : str) {
			   
			strlist.add(string);
			
		}
		
		Collections.sort(strlist);
		System.out.println(strlist);
		
		for (int i = strlist.size()-1; i >=0; i--) {
			
			  System.out.print(strlist.get(i)+" ");
			
		}
	}

}
