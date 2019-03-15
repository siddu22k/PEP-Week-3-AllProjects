package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMultiply {

	@Test
	//testMultiply method is unit testing(test case) for multiply method
	void testMultiply() {
		Calculate test = new Calculate();
		int op = test.multiply(5, 10);
		assertEquals(50,op);
	}

}
