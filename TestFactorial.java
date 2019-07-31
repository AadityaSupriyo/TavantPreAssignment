import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactorial {

	@Test
	void test() {
		Factorial fac = new Factorial();
		int actual = fac.fact(5);
		int expect=120;
		
		assertEquals(actual,expect);
	}

}
