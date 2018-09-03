package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.ValidateName;

class ValidateNameTest {

	@Test
	void test() {
		assertEquals(false, ValidateName.valid("29/02/2011",2));
		assertEquals(true, ValidateName.valid("29/02/2012",2));
		assertEquals(true, ValidateName.valid("20/09/2015",2));
	}
}