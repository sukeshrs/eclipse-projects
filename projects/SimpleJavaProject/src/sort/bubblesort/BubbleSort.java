package sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {

	public void sort(int[] ar) {
		
		if (null == ar || ar.length==0){
			return;
		}
		
		int len = ar.length-1;
		
		System.out.println(ar);
		
	
		while (len >=0){

			for (int j= 0; j< len ;j++){				
				
				if (ar[j]>ar[j+1]){
					swap(ar, j);
				}
			}
			len = len -1;
		}
	
		
		System.out.println(Arrays.toString(ar));

	}

	private static void swap(int[] ar, int j) {
		int temp = ar[j];
		ar[j] = ar [j+1];
		ar[j+1] =temp;
	}
}
