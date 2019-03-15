package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDivide {

	@Test
	//testDivide method is unit testing(test case) for divide method
	void testDivide() {
		Calculate test = new Calculate();
		int op = test.divide(10, 5);
		assertEquals(2,op);
	}

}
