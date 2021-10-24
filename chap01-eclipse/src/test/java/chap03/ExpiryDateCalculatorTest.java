package test.java.chap03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ExpiryDateCalculatorTest {

	@Test
	void ����_�����ϸ�_�Ѵ�_�ڰ�_��������_��() {
		assertExpiryDate(LocalDate.of(2019, 3, 1), 10_000, LocalDate.of(2019, 4, 1));
		assertExpiryDate(LocalDate.of(2019, 5, 5), 10_000, LocalDate.of(2019, 6, 5));
	}
	
	@Test
	void �����ϰ�_�Ѵ�_��_���ڰ�_����_����() {
		assertExpiryDate(LocalDate.of(2019, 1, 31), 10_000, LocalDate.of(2019, 2, 28));
		assertExpiryDate(LocalDate.of(2019, 5, 31), 10_000, LocalDate.of(2019, 6, 30));
		assertExpiryDate(LocalDate.of(2020, 1, 31), 10_000, LocalDate.of(2020, 2, 29));
	}

	private void assertExpiryDate(LocalDate billingDate, int payAmount, LocalDate expectedExpiryDate) {
		ExpiryDateCalculator cal = new ExpiryDateCalculator();
		LocalDate realExpiryDate = cal.calculateExpiryDate(billingDate, payAmount);

		assertEquals(expectedExpiryDate, realExpiryDate);
	}
}
