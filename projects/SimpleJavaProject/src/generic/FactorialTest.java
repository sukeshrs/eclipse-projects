package generic;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FactorialTest {
	
	@Test
	public void testOneFact(){
		Factorial fact = new Factorial();
		
		long value = fact.factorial(3);
		assertEquals(6,value);
		 value = fact.factorial(4);
		assertEquals(24,value);

		
	}

}
