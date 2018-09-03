package com.capgemini.day7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Grep {

	public static Object stringSearch(File file, String string) {
		int lineCount=0;
				if(file.exists()) {
					try(FileReader filereader=new FileReader(file);
						BufferedReader br=new BufferedReader(filereader);){
						String s;
						while( (s = br.readLine()) != null) {
							lineCount++;
							if(!s.equals(" ")) {
								String[] words =s.split(" +");
								for(int i=0;i<words.length;i++)
								{
									if(words[i].equals(string)) {
										System.out.println(lineCount+ " " +s);
										break;
									}
								}
							}
						}
		return true;
						
						
					}
					catch(IOException e) {
						e.printStackTrace();
					}
				}
				System.out.println("The file does not exists");
				return false;
			}
			

}