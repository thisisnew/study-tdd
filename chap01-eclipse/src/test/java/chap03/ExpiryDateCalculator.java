package test.java.chap03;

import java.time.LocalDate;

public class ExpiryDateCalculator {
	public LocalDate calculateExpiryDate(PayData payData) {
		int addedMonths  = 1;
		if (payData.getFirstBillngDate() != null) {
			LocalDate candidateExp = payData.getBillingDate().plusMonths(addedMonths);
			if (payData.getFirstBillngDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {
				return candidateExp.withDayOfMonth(payData.getFirstBillngDate().getDayOfMonth());
			}
		}

		return payData.getBillingDate().plusMonths(addedMonths);
	}
}
