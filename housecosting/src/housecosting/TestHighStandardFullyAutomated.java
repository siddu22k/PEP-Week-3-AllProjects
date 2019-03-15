package housecosting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestHighStandardFullyAutomated {

	@Test

	//method for testing Correctness of costing
	void test() {
		HouseCosting test = new HouseCosting();
		int op = test.constructionCost("high standard and fully automated", 10);
		assertEquals(25000,op);
		
	}

}








