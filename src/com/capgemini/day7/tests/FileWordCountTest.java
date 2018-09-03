package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.WordCount;

class FileWordCountTest {
    int count;
    @Test
	void testWordCount() throws IOException {
		
			
		assertEquals(5,WordCount.countWords("C:\\uploads\\Car.java"));
	}
}