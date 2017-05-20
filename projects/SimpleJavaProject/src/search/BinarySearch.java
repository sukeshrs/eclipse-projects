package search;

public class BinarySearch {

	public static boolean contains (int[] a , int i){
		
		if (null == a || a.length ==0){
			return false;
		}
		
		int high = a.length-1;
		int low = 0;
		
		while (low <= high){
			int middle = (low+high) /2;
			if (i> a[middle]){
				low = middle +1;
			}else if (i<a[middle]){
				high = middle -1;
			}else {
				return true;
			}
			
		}
		
		return false;
		
	}
}
