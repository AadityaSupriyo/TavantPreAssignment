import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tempraturetest {

	@Test
	void test() {
		Temprature temp = new Temprature();
		double expect=100.4;
		double expect1=22.22222222222222;
		double actual=temp.celToFar(38);
		double actual1=temp.farToCel(72);
		assertEquals(actual,expect);
		assertEquals(actual1,expect1);
	}

}
