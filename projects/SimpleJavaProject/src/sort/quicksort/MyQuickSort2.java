package sort.quicksort;

public class MyQuickSort2 {

	private int[] ar;
	private int length;
	
	public MyQuickSort2(int array[]){
		this.ar=array;
	}
	
	public MyQuickSort2(){
	}

	public void sort(int[] array) {
		if (array == null || array.length == 0) {
			return;
		}
		this.ar = array;
		this.length = array.length;

		quickSort(0, length - 1);

	}

	private void quickSort(int start, int end) {
		if (start < end) {
			int partitionIndex = partition(0, end);
			quickSort(start, partitionIndex - 1);
			quickSort(partitionIndex + 1, end);
		}

	}

	public int partition(int start, int end) {
		int pivot = ar[end];
		int partitionIndex = start;

		for (int i = 0; i < end; i++) {
			if (ar[i] <= pivot) {
				swap(i, partitionIndex);
				partitionIndex++;
			}
		}
		
		System.out.println("partitionIndex" + partitionIndex);

		swap(partitionIndex, end);

		return partitionIndex;

	}
	
	private void swap(int i, int j) {
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;

	}
}
