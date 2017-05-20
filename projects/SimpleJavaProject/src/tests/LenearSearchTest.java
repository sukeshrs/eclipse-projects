package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import search.LenearSearch;

public class LenearSearchTest {
	
	@Test
	public void IttestsContains (){
		
		int[] a ={3,5,2,3};
		
		int b=2;
		
		LenearSearch lenearSearch = new LenearSearch();
		boolean value = lenearSearch.contains(a, b);
		assertEquals(true, value);
	}

	
	@Test
	public void IttestsContainsFalse (){
		
		int[] a ={3,5,2,3};
		
		int b=8;
		
		LenearSearch lenearSearch = new LenearSearch();
		boolean value = lenearSearch.contains(a, b);
		assertEquals(false, value);
	}
}
