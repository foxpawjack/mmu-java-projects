package com.jacknoble;

import java.util.*;

public class DataUtil {
	
	//This file does all the workings out for the file, including getting the
	//information from the user. It then outputs this data to the main class.
	
	public static double findMaxPlayer(List<Double> array) {
		//This finds the highest paid player in the whole file.
		
		double max;
		
		max = array.get(0);
		
		for(int i = 1; i < array.size(); ++i) {
			if(array.get(i) > max) {
				max = array.get(i);
			}
		}
		
		return max;
	}

}
