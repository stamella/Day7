package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.DateFormat7;

class DateFormat7Test {

	@Test
	void test() throws ParseException {
			
			
			
			 assertEquals("12/12/2010",DateFormat7.DateFormat7("12122010"));
			 assertEquals("12 December, 2010",DateFormat7.DateFormat07("12122010"));
   
}
}

