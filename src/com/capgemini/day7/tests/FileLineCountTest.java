package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.LineCount;

class FileLineCountTest {

	@Test
	void testLineCount() throws IOException {
		
			
		assertEquals(2,LineCount.countLines("C:\\uploads\\Car.java"));
	}
}