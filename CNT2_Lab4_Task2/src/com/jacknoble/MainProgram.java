package com.jacknoble;

import java.io.*;
import java.util.*;

public class MainProgram {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		CsvReader read = new CsvReader("./files/Salaries.csv");
		read.hasHeader=true;
		read.readFile();
		
		for(FileData d:read.getDataList()) {
			System.out.println(d.toString());
		}
		
		List<Double> salary = new ArrayList<Double>();
		
		for(FileData d: read.getDataList()){
			salary.add(d.getSalary());
		}
		
		System.out.println("The highest paid player is > " + DataUtil.findMaxPlayer(salary));

	}

}
