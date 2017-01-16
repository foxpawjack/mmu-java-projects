package uk.ac.mmu.cnt;

import java.io.*;

public class Lab1_Task2 {

	public static void main(String[] args) throws IOException{
		//Declare floats and strings
		int selector;
		float temp;
		
		String selectorStr;
		String tempStr;
		
		//Setup buffered reader
		BufferedReader console =
				new BufferedReader(new InputStreamReader(System.in));
		
		//Print some random stuff, who doesn't like filler text in their programs!
		System.out.println("CNT Lab 2 - Temperature Converter");
		System.out.println("ver 1.0.0 (06/10/2015) - Still No Methods Edition!");
		System.out.println("By Jack Noble - 15081579");
		System.out.println("");
		
		//Get the type of value being entered
		System.out.println("What unit are you wanting to convert from?");
		System.out.println("Enter 1 if you wish to convert Celcius to Fahrenheit and Kelvin");
		System.out.println("Enter 2 if you wish to convert Fahrenheit to Celcius and Kelvin");
		System.out.println("Enter 3 if you wish to convert Kelvin to Celcius and Fahrenheit");
		
		selectorStr = console.readLine();
		selector = Integer.parseInt(selectorStr);
		
		//Get the value to be converted
		System.out.println("");
		System.out.println("Enter the value you wish to convert:");
		
		tempStr = console.readLine();
		temp = Float.parseFloat(tempStr);
		
		//Check what the user has entered and run the jewels
		if(selector == 1){
			System.out.println("");
			System.out.println("Converting " + tempStr + "C to Fahrenheit...");
			System.out.println((temp*9/5+32) + "F");
			System.out.println("Converting " + tempStr + "C to Kelvin...");
			System.out.println((temp+273.15) + "K");
		}
		else if(selector == 2){
			System.out.println("");
			System.out.println("Converting " + tempStr + "F to Celcius...");
			System.out.println(((temp-32)*5/9) + "C");
			System.out.println("Converting " + tempStr + "F to Kelvin...");
			System.out.println(((temp-32)*5/9+273.15) + "K");
		}
		else if(selector == 3){
			System.out.println("");
			System.out.println("Converting " + tempStr + "K to Celcius...");
			System.out.println((temp-273.15) + "C");
			System.out.println("Converting " + tempStr + "K to Fahrenheit...");
			System.out.println(((temp-273.15)*9/5+32) + "F");
		}
		else{
			System.out.println("You have entered an invalid option.");
			System.out.println("Please restart the program and try again!");
			System.out.println("If this error persist, consider checking the status of the universe...");
			System.out.println("It might be collapsing in on itself...");
			System.out.println("That sucks...");
		}
	}
}
