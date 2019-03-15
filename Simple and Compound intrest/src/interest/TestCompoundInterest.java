package interest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompoundInterest {

	@Test
	
	//Method for testing CompoundInterest
	void testCompoundInterest() {
		InterestCalculation test = new InterestCalculation();
		double op = test.compoundInterest(1200, 2, 5.4);
		assertEquals(1335.4332141502573,op);
	}

}
