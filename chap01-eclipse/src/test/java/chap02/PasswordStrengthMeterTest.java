package test.java.chap02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PasswordStrengthMeterTest {
	PasswordStrengthMeter meter = new PasswordStrengthMeter();

	private void assertStrengh(String password, PasswordStrength expStr) {
		PasswordStrength result = meter.meter(password);
		assertEquals(expStr, result);
	}

	@Test
	void meetsAllCriteria_Then_Strong() {
		assertStrengh("ab12!@AB", PasswordStrength.STRONG);
		assertStrengh("abc1!Add", PasswordStrength.STRONG);
	}

	@Test
	void meetsOtherCriteria_except_for_Length_Then_Normal() {
		assertStrengh("ab12!@A", PasswordStrength.NORMAL);
	}

	@Test
	void meetsOtherCriteria_except_for_number_Then_Normal() {
		assertStrengh("ab!@ABqwer", PasswordStrength.NORMAL);
	}
	
	@Test
	void nullInput_Then_Invalid() {
		assertStrengh(null, PasswordStrength.INVALID);
	}
	
	@Test
	void meetsOtherCriteria_except_for_Uppercase_Then_Normal() {
		assertStrengh("ab12!@df", PasswordStrength.NORMAL);
	}
}
