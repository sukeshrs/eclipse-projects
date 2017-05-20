package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import search.BinarySearch;
import search.LenearSearch;

public class BinarySearchTest {

	@Test
	public void testNull(){		
		boolean value = BinarySearch.contains(null, 1);
		assertFalse(value);		
	}
	
	@Test
	public void testEmpty(){		
		boolean value = BinarySearch.contains(new int[0], 1);
		assertFalse(value);		
	}
	
	@Test
	public void IttestsContainsFalse (){
		
		int[] a ={3,5,2,3};
		
		int b=8;
		
		
		boolean value = BinarySearch.contains(a, b);
		assertEquals(false, value);
	}
	
	@Test
	public void IttestsContainsTrue (){
		
		int[] a ={1,2,7,8};
		
		int b=2;
		
		
		boolean value = BinarySearch.contains(a, b);
		assertEquals(true, value);
	}
}

