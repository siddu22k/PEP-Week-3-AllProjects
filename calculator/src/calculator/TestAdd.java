package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAdd {

	@Test
	//testAdd method is unit testing(test case) for add method
	void testAdd() {
		Calculate test = new Calculate();
		int op = test.add(5, 10);
		assertEquals(15,op);
		
	}

}
