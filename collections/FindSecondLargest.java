package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> unique = new TreeSet<>();
				
		for (int i = 0; i < data.length; i++) {
			
			unique.add(data[i]);
			
			}
			List<Integer> l= new ArrayList<Integer>(unique);
			int size=l.size();
			System.out.println(l.get(size-2));
	}

}
