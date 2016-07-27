import static org.junit.Assert.*;

import org.junit.Test;

public class SieveTester {
	//calculateMax Test. This test sees if the method catches an illegal argument, 
	//in this case, the illegal argument is an array with no elements
	//The test should pass
	@Test
	public void calculateMaxTest1() {
		String [] array = {};
		try{
			Sieve thing = new Sieve();
			thing.calculateMax(array);
			fail();
		} catch (IllegalArgumentException ex) {
			
		}
		
	}
	
	//calculateMax Test. This test sees if the method catches an illegal argument, 
	//in this case, the illegal argument is an array with a negative number
	//The test should pass
	@Test
		public void calculateMaxTest2() {
		String [] array = {"-1"};
		try{
			Sieve thing = new Sieve();
			thing.calculateMax(array);
			fail();
		} catch (IllegalArgumentException ex) {
			
		}
		
		}

}
