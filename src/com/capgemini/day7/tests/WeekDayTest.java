package com.capgemini.day7.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.WeekDay;

class WeekDayTest {

	@Test
	
		void testWeekDay() {
			
			assertEquals("Monday,September 03,2018",WeekDay.displayWeekDay());
	}

}