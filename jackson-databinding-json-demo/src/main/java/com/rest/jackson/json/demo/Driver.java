package com.rest.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			
			
			//create object mapper
			ObjectMapper mapper=new ObjectMapper();
			
			
			//read json file and convert to java pojo
			Student theStudent=mapper.readValue(new File("data/sample-full.json"),Student.class);
			
			System.out.println("First name= "+theStudent.getFirstName());
			System.out.println("Last name= "+theStudent.getLastName());
			
			System.out.println("Address: "+theStudent.getAddress());
			
			for (String string : theStudent.getLanguages())
			{
				System.out.println(string);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
