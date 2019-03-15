package housecosting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAboveStandard {

	@Test

	//method for testing Correctness of costing
	void test() {
		HouseCosting test = new HouseCosting();
		int op = test.constructionCost("above standard", 10);
		assertEquals(15000,op);
		
	}

}
