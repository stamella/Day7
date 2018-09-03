package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.VowelsAndConsonants;

class VowelsAndConsonantsTest {

	@Test
	void testVowelsAndConsonants() throws IOException {
			File file = new File("C:\\uploads\\Car.java");
					

			assertEquals("Number of vowels = 29\nNumber of consonants = 59", VowelsAndConsonants.findVowelAndConsonant(file));
		}
}