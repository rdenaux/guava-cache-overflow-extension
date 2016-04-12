package com.blogspot.mydailyjava.guava.cache.overflow;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FilenameEncoderTest {

	@Test
	public void testEncode() {
		String encoded = FilenameEncoder.encode("http://example.com/");
		assertEquals("http%3A%2F%2Fexample.com%2F", encoded);
	}
	
	@Test
	public void testDecode() {
		String decoded = FilenameEncoder.decode("http%3A%2F%2Fexample.com%2F");
		assertEquals("http://example.com/", decoded);
	}
}
