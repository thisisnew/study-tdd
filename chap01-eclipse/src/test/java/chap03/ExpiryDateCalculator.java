package test.java.chap03;

import java.time.LocalDate;
import java.time.YearMonth;

public class ExpiryDateCalculator {
	public LocalDate calculateExpiryDate(PayData payData) {
		int addedMonths = payData.getPayAmount() / 10_000;
		if (payData.getFirstBillngDate() != null) {
			LocalDate candidateExp = payData.getBillingDate().plusMonths(addedMonths);
			if (payData.getFirstBillngDate().getDayOfMonth() != candidateExp.getDayOfMonth()) {

				if (YearMonth.from(candidateExp).lengthOfMonth() < payData.getFirstBillngDate().getDayOfMonth()) {
					return candidateExp.withDayOfMonth(YearMonth.from(candidateExp).lengthOfMonth());
				}
				return candidateExp.withDayOfMonth(payData.getFirstBillngDate().getDayOfMonth());
			}
		}

		return payData.getBillingDate().plusMonths(addedMonths);
	}
}
