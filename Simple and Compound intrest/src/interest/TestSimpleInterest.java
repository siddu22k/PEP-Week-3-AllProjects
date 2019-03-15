package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSimpleInterest {

	@Test
	
	//Method for testing SimpleInterest
	void test() {
		InterestCalculation test = new InterestCalculation();
		double op = test.simpleInterest(10000, 5, 5);
		assertEquals(2500,op);
	}

}
