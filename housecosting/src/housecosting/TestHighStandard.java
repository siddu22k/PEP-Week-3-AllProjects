package housecosting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHighStandard {

	@Test

	//method for testing Correctness of costing
	void test() {
		HouseCosting test = new HouseCosting();
		int op = test.constructionCost("high standard", 10);
		assertEquals(18000,op);
		
	}

}
