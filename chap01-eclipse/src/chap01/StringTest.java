package chap01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringTest {
	
	@Test
	void subString() {
		String str = "abcde";
		assertEquals("cd", str.substring(2,4));
	}
	
}
