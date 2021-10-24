package test.java.chap03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
	public LocalDate calculateExpiryDate(PayData payData) {
		if (payData.getFirstBillngDate() != null) {
			LocalDate candidateExp = payData.getBillingDate().plusMonths(1);
			if (payData.getFirstBillngDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {
				return candidateExp.withDayOfMonth(payData.getFirstBillngDate().getDayOfMonth());
			}
		}

		return payData.getBillingDate().plusMonths(1);
	}
}
