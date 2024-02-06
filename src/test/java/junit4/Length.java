package junit4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Length {
	@Test
	public void testLength() {
		String str = new String("John");
		assertEquals(4, str.length());
	}

	@Test
	public void testCharat() {
		String str = new String("John");
		char result = str.charAt(0);
		assertEquals('J', result);
	}

	@Test
	public void testSubString() {
		String str = new String("John Doe");
		String result = str.substring(1, 4);
		assertEquals("ohn", result);
	}

	@Test
	public void indexOf() {
		String str = new String("John Doe");
		int result = str.indexOf("Doe");
		assertEquals(5, result);
	}
}
