package com.jack;

import java.util.*;
import java.io.*;

public class WeatherProgram {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		FileReading read = new FileReading("./file/weatherdata.csv");
		read.readFile();
		
		/*
		for(FileData d:read.getDataList()) {
			System.out.println(d.toString());
		}
		*/
		
		List<Double> tempmax = new ArrayList<Double>();
		List<Double> tempmin = new ArrayList<Double>();
		
		for(FileData d: read.getDataList()) {
			tempmax.add(d.getTempmax());
			tempmin.add(d.getTempmin());
		}
		
		System.out.println("Max value in min temp > " + FileUtility.findMaxFromArray(tempmin));
		System.out.println("Min value in min temp > " + FileUtility.findMinFromArray(tempmin));
		System.out.println("Max value in max temp > " + FileUtility.findMaxFromArray(tempmax));
		System.out.println("Min value in max temp > " + FileUtility.findMinFromArray(tempmax));
		
		System.out.println("Avg. in max temp > " + FileUtility.findAverageFromArray(tempmax));
		System.out.println("Min all year > " + FileUtility.findAverageFromArray(tempmin));
		
	}

}
