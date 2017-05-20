package sort.quicksort;

public class QuickSortImpl {
	
	public static void main (String a[]){
		MyQuickSort sorter = new MyQuickSort();
		int[] input = {24,2,45,20,56,75,2,56,99,53,12};
		sorter.sort(input);
		
		for (int i : input){
		
		System.out.println(i);	
		}
	}

}
