package test.java.chap02;

public class PasswordStrengthMeter {
	public PasswordStrength meter(String s) {
		if(s == null || s.isBlank()) {
			return PasswordStrength.INVALID;
		}
		
		int metCounts = 0;
		if(s.length() >= 8) {
			metCounts++;
		}
		
		if(meetsContainingNumberCriteria(s)) {
			metCounts++;
		}
		
		if(meetsContainingUpperCriteria(s)) {
			metCounts++;
		}
		
		if(metCounts <= 1) {
			return PasswordStrength.WEAK;
		}
		
		if(metCounts == 2) {
			return PasswordStrength.NORMAL;
		}
		
		return PasswordStrength.STRONG;
	}
	
	private boolean meetsContainingNumberCriteria(String s) {
		for(char ch : s.toCharArray()) {
			if(ch >='0' && ch <='9') {
				return true;
			}
		}
		
		return false;
	}
	
	private boolean meetsContainingUpperCriteria(String s) {
		for(char ch : s.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				return true;
			}
		}
		
		return false;
	}
}
