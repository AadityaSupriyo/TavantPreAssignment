import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSumOfNo {

	@Test
	void test() {
		SumOfNo sumof = new SumOfNo();
		int actual = sumof.sumOfEven(1,20);
		int expect = 110;
		int actual1 = sumof.sumOfOdd(1,20);
		int expect1 = 100;
		
		assertEquals(actual,expect);
		assertEquals(actual1,expect1);
	}

}
