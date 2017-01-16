/*
 * CNT 2 - Lab 2 - Task One
 * Income Tax Calculator
 * by Jack Noble
 * 
 * Date: 13/10/2016
 */

package uk.ac.mmu.cnt;

import java.io.*;

public class Lab2Task1 {

	public static void main(String[] args) throws IOException{
		//Declare variables and strings
		
		int selectorMode; 	//This will be used to select annual, monthly or weekly
		double incomeAmt;	//This is the income that the user will enter
		double fairAmt;
		
		String selectorString;		//This is for the buffered reader
		String incomeString;		//This is also for the buffered reader
		
		//Create the buffered reader
		BufferedReader console=
				new BufferedReader(new InputStreamReader(System.in));
		
		//Print some introductory text about the program
		System.out.println("CNT2 Lab 2 - Income Tax Calculator");
		System.out.println("ver 1.0.0 (13/10/2016)");
		System.out.println("By Jack Noble - 15081579");
		System.out.println("");
		
		//Get the selector value from the user
		System.out.println("Choose from the following:");
		System.out.println("1. Annual Calculation");
		System.out.println("2. Monthly Calculation");
		System.out.println("3. Weekly Calculation");
		
		System.out.println("Enter here and press <ENTER>");
		selectorString = console.readLine();
		selectorMode = Integer.parseInt(selectorString);
		
		//Inform the user of their choice
		if(selectorMode == 1){
			System.out.println("You have selected Annual Income Tax calcultor.");
		}
		else if(selectorMode == 2){
			System.out.println("You have selected Monthly Income Tax calculator");
		}
		else if(selectorMode == 3){
			System.out.println("You have selected Weekly Income Tax calculator");
		}
		else{
			System.out.println("You have entered an invalid selection, please try again.");
		}
		
		//Get the income from the user
		System.out.println("Enter the relevant salary below:");
		incomeString = console.readLine();
		incomeAmt = Double.parseDouble(incomeString);
		
		//Initialise fairAmt for the 11k tax allowance
		fairAmt = incomeAmt;
		
		//Times input by 12 and 52 for weekly and monthly salary modes
		if(selectorMode == 1){
			incomeAmt = incomeAmt*0;
		}
		if(selectorMode == 2){
			incomeAmt = incomeAmt*12;
		}
		if(selectorMode == 3){
			incomeAmt = incomeAmt*52;
		}
		
		//Calculate income tax for annual input
		System.out.println("Calculating the income tax for £" + incomeAmt);
			
		if(incomeAmt > 11000){
			fairAmt = (incomeAmt-11000);
		}
		if(incomeAmt <= 11000){
			System.out.println("Annual Tax Payable = £" + (fairAmt/100*0));
			System.out.println("Monthly Tax Payable = £" + ((fairAmt/100*0)/12));
			System.out.println("Annual Take Home Salary = £" + (incomeAmt));
			System.out.println("Monthly Take Home Salary = £" + (incomeAmt/12));
		}
		if(incomeAmt > 11001 && incomeAmt <= 43000){
			System.out.println("Annual Tax Payable = £" + (fairAmt/100*20));
			System.out.println("Monthly Tax Payable = £" + ((fairAmt/100*20)/12));
			System.out.println("Annual Take Home Salary = £" + (incomeAmt-fairAmt));
			System.out.println("Monthly Take Home Salary = £" + (incomeAmt-fairAmt/12));
		}
		if(incomeAmt > 43001 && incomeAmt <= 150000){
			System.out.println("Annual Tax Payable = £" + (fairAmt/100*40));
			System.out.println("Monthly Tax Payable = £" + ((fairAmt/100*40)/12));
			System.out.println("Annual Take Home Salary = £" + (incomeAmt-fairAmt));				System.out.println("Monthly Take Home Salary = £" + (incomeAmt-fairAmt/12));
		}
		if(incomeAmt > 150000){
			System.out.println("Annual Tax Payable = £" + (fairAmt/100*45));
			System.out.println("Monthly Tax Payable = £" + ((fairAmt/100*45)/12));
			System.out.println("Annual Take Home Salary = £" + (incomeAmt-fairAmt));
			System.out.println("Monthly Take Home Salary = £" + (incomeAmt-fairAmt/12));
		}
	}

}
