package tests.bubblesort;

import org.junit.Test;

import sort.bubblesort.BubbleSort;

public class BubbleSortTest {
	
	@Test
	public void TestNull (){
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(null);
		
		//int array[] = {3,6,1,7,9,2,4,5};
	}

	@Test
	public void TestEmpty (){
		BubbleSort bubbleSort = new BubbleSort();
		bubbleSort.sort(new int[0]);
		
		//int array[] = {3,6,1,7,9,2,4,5};
	}
	
	@Test
	public void TestSort (){
		BubbleSort bubbleSort = new BubbleSort();	
		
		int array[] = {3,6,1,7,9,2,4,5};
		bubbleSort.sort(array);
		
		System.out.println(array);
		
		for (int i=0 ;i<array.length ;i++){
			System.out.println(array[i] ); 
			
		}
	}
}
