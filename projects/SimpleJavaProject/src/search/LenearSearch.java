package search;

public class LenearSearch {
	
	public static boolean contains (int[] a , int i){
		
		for (int j : a){
			if (j == i){
				return true;
			}
		}
		return false;
		
	}

}
