package compare;

import java.util.Arrays;

public class SortArray {
	
	public static void main (String args[]){
		
		String[] names = new String[] {"Roger","Adam", "Bing", "Tom","Nadal"};
		Arrays.sort(names);		
		
		for (String temp : names){
			System.out.println(temp);
		}
		

	}

}
