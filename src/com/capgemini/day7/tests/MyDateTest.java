package com.capgemini.day7.tests;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.day7.MyDate;

class MyDateTest {

		@SuppressWarnings("unchecked")
		@Test
		void testMyDate() {
			
	          MyDate date1=new MyDate(LocalDate.of(2017, 05, 16));
	          MyDate date2=new MyDate(LocalDate.of(2012, 07, 13));
	          MyDate date3=new MyDate(LocalDate.of(2016, 03, 16));
	          
	          ArrayList<MyDate> al=new ArrayList<>();
	          al.add(date1);
	          al.add(date2);
	          al.add(date3);
	          
	          ArrayList<MyDate> result=new ArrayList<>();
	          
	          try(FileOutputStream fileOutput=new FileOutputStream("C:\\uploads\\Date.java");
	        		 ObjectOutputStream objectOutput=new ObjectOutputStream(fileOutput))
	        		  {
	        	  objectOutput.writeObject(al);
	        	  
	          }
	          catch(IOException e)
	          {
	        	  e.printStackTrace();
	          }
	          
	          try(FileInputStream fileInput=new FileInputStream("C:\\uploads\\Date.java");
	         		 ObjectInputStream objectInput=new ObjectInputStream(fileInput))
	         		  {
	         	   result=(ArrayList<MyDate>)objectInput.readObject();
	           }
	           catch(IOException e)
	           {
	         	  e.printStackTrace();
	           } catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
	          System.out.println(result);
		}

	}