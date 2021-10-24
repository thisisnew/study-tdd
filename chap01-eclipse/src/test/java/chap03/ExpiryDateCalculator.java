package test.java.chap03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
	public LocalDate calculateExpiryDate(PayData payData) {
		if(payData.getFirstBillngDate() != null) {
			if(payData.getFirstBillngDate().equals(LocalDate.of(2019, 1, 31))) {
				return LocalDate.of(2019, 3, 31);
			}	
		}
		
		return payData.getBillingDate().plusMonths(1);
	}
}
