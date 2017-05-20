package sort.quicksort;

public class MyQuickSort {
	
	private int array[];
	private int length;
	
	public void sort (int[] inputArray ){
		if (inputArray == null || inputArray.length ==0){
			return;
		}
		
		this.array = inputArray;
		length = inputArray.length;
		quickSort(0,length-1);
	}

	private void quickSort(int lowerIndex, int higherIndex) {
		int i = lowerIndex;
		int j =	higherIndex;	
		int pivot = array[(i+j)/2];
		System.out.println("pivot" + pivot);
		
		while (i <= j){
			
			//No swapping done  . Just move the left index forward.
			while (array[i] <pivot){
				i++;
			}
			//No swapping done  . Just move the right index backwards.
			while (array[j] > pivot){
				j--;
			}
			
			if (i <= j){
				swapNumbers(i,j);
				i++;
				j--;
			}
			
			if (lowerIndex < j){
				quickSort(lowerIndex, j);
			}
			
			if (i < higherIndex){
				quickSort(i, higherIndex);
			}
		}
		
	}

	private void swapNumbers(int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp; 		
	}
	
	

}
