package housecosting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStandard {

	@Test

	//method for testing Correctness of costing
	void test() {
		HouseCosting test = new HouseCosting();
		int op = test.constructionCost("standard", 10);
		assertEquals(1200,op);
		
	}

}
