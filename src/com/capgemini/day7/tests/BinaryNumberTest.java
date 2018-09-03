package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;


import com.capgemini.day7.BinaryNumber;

class BinaryNumberTest {

	@Test
	void testBinaryInteger() {
		File file = new File("C:\\uploads\\Car.java");
		assertEquals(1,BinaryNumber.writeBinary(file));
	}

}