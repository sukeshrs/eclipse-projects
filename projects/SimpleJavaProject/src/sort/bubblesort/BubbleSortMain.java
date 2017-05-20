package sort.bubblesort;

import java.util.Arrays;

public class BubbleSortMain {

	public static void main (String args[]){
		int ar[] = {1,6,3,7,34,56,9,4,8,2};
		sort(ar);
	}

	private static void sort(int[] ar) {
		int len = ar.length-1;
		
		System.out.println(ar);
		
	
		while (len >=0){

			for (int j= 0; j< len ;j++){				
				
				if (ar[j]>ar[j+1]){
					int temp = ar[j];
					ar[j] = ar [j+1];
					ar[j+1] =temp;
				}
			}
			len = len -1;
		}
	
		
		System.out.println(Arrays.toString(ar));
	}

	private static void swap(int[] ar, int j) {
		int temp = ar[j];
		ar[j] = ar [j+1];
		ar[j] =temp;
	}
}
