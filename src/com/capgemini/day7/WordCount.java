package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
	public static int countWords(String s) {
		int count = 0;
		File file = new File("C:\\uploads\\Car.java");
		try (FileReader filereader = new FileReader(file); BufferedReader reader = new BufferedReader(filereader);) {

			while ((s = reader.readLine()) != null) {
				String word[]=s.split(" ");
				count+= word.length;
				break;

				}
		} catch (IOException e) {

			e.printStackTrace();
		}
		return count;
}
}