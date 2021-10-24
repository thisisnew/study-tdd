package test.java.chap03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class ExpiryDateCalculatorTest {
	
	@Test
	void ����_�����ϸ�_�Ѵ�_�ڰ�_��������_��() {
		LocalDate biilingDate = LocalDate.of(2019, 3, 1);
		int payAmount = 10_000;
		
		ExpiryDateCalculator cal = new ExpiryDateCalculator();
		LocalDate expiryDate = cal.calculateExpiryDate(biilingDate, payAmount);
		
		assertEquals(LocalDate.of(2019, 4, 1), expiryDate);
		
		LocalDate billingDate2 = LocalDate.of(2019, 5, 5);
		int payAmount2 = 10_000;
		
		ExpiryDateCalculator cal2 = new ExpiryDateCalculator();
		LocalDate expiryDate2 = cal2.calculateExpiryDate(billingDate2, payAmount2);
		
		assertEquals(LocalDate.of(2019, 6, 5), expiryDate2);
	}
}
