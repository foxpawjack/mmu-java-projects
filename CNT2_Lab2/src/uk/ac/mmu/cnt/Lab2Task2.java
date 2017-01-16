/*
 * CNT 2 - Lab 2 - Task Two
 * Body Mass Index Calculator
 * by Jack Noble
 * 
 * Date: 13/10/2016
 */

package uk.ac.mmu.cnt;

import java.io.*;

public class Lab2Task2 {

	public static void main(String[] args) throws IOException{
		//Declare doubles and strings
		int genderSel;
		int systemSel;
		double weightNum;
		double heightNum;
		double bmiNum = 0;
		
		String genderStr;
		String systemStr;
		String weightStr;
		String heightStr;
		
		//Create buffered reader
		BufferedReader console=
				new BufferedReader(new InputStreamReader(System.in));
		
		//Print the welcome text, think of it like a nice rug, or a potted plant...
		System.out.println("CNT2 Lab 2 - BMI Calculator");
		System.out.println("ver 1.0.0 (13/10/2016)");
		System.out.println("By Jack Noble - 15081579");
		System.out.println("");
		
		//Get the data inputs from the user
		System.out.println("Enter the following to set your gender: [1] Male - [2] Female");
		genderStr = console.readLine();
		genderSel = Integer.parseInt(genderStr);
		
		System.out.println("Before we begin, we need to know what numerical system you're using.");
		System.out.println("Enter [1] for Imperial (pounds and inches)");
		System.out.println("Enter [2] for Metric (KGs and Meters)");
		systemStr = console.readLine();
		systemSel = Integer.parseInt(systemStr);
		
		System.out.println("Enter your weight in the chosen format:");
		weightStr = console.readLine();
		weightNum = Double.parseDouble(weightStr);
		
		System.out.println("Enter your height in the chosen format:");
		heightStr = console.readLine();
		heightNum = Double.parseDouble(heightStr);
		
		//Work out the initial BMI
		if(systemSel == 1){
			bmiNum = ((weightNum/heightNum*heightNum)*703);
		}
		else if(systemSel == 2){
			bmiNum = (weightNum/heightNum*heightNum);
		}
		else{
			System.out.println("An error has occured, restart the program and try again");
		}
		
		//Work out the status of the user - if female
		if(genderSel == 2 && bmiNum < 19.1){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Underweight");
		}
		if(genderSel == 2 && bmiNum >= 19.1 && bmiNum < 25.8){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Normal");
		}
		if(genderSel == 2 && bmiNum >= 25.8 && bmiNum < 27.3){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Marginally Overweight");
		}
		if(genderSel == 2 && bmiNum >= 27.3 && bmiNum < 32.3){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Overweight");
		}
		if(genderSel == 2 && bmiNum > 32.3){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Obese");
		}
		
		//Work out the status of the user - if male
		if(genderSel == 1 && bmiNum < 20.7){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Underweight");
		}
		if(genderSel == 1 && bmiNum >= 20.7 && bmiNum < 26.4){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Normal");
		}
		if(genderSel == 1 && bmiNum >= 26.4 && bmiNum < 27.8){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Marginally Overweight");
		}
		if(genderSel == 1 && bmiNum >= 27.8 && bmiNum < 31.1){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Overweight");
		}
		if(genderSel == 1 && bmiNum > 31.1){
			System.out.println("Your BMI is: " + bmiNum);
			System.out.println("This is classed as Obese");
		}

	}

}
