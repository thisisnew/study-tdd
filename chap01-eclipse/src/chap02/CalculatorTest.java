package chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
	
	void plus() {
		int result = Calculator.plus(1,2);
		assertEquals(3, result);
	}
	
}
