package test.java.chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {
	PasswordStrengthMeter meter = new PasswordStrengthMeter();

	@Test
	void meetsAllCriteria_Then_Strong() {

		PasswordStrength result = meter.meter("ab12!@AB");
		assertEquals(PasswordStrength.STRONG, result);

		PasswordStrength result2 = meter.meter("abc1!Add");
		assertEquals(PasswordStrength.STRONG, result2);
	}

	@Test
	void meetsOtherCriteria_except_for_Length_Then_Normal() {

		PasswordStrength result = meter.meter("ab12!@A");
		assertEquals(PasswordStrength.NORMAL, result);
	}

	@Test
	void meetsOtherCriteria_except_for_number_Then_Normal() {

		PasswordStrength result = meter.meter("ab!@ABqwer");
		assertEquals(PasswordStrength.NORMAL, result);
	}
}
