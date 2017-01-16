package com.jack;

import java.util.*;

public class FileUtility {
	
	public static double findMaxFromArray(List<Double> array) {
		double max;
		max = array.get(0);
		for(int i=1;i<array.size();++i) {
			if(array.get(i)>max) {
				max = array.get(i);
			}
		}
		
		return max;
	}
	
	public static double findMinFromArray(List<Double> array) {
		double min;
		min = array.get(0);
		for(int i=1;i<array.size();++i) {
			if(array.get(i)<min) {
				min = array.get(i);
			}
		}
		
		return min;
	}
	
	public static double findAverageFromArray(List<Double> array) {
		double average;
		double sum = 0;
		for(int i=0;i<array.size();++i) {
			sum += array.get(i);
		}
		average = sum/array.size();
		return average;
	}

}
