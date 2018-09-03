package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileExistTest {

	@Test
	void testFileExistance() {
		File file = new File("C:\\uploads\\Car.java");
		assertEquals(true, file.exists());
		
	}

}