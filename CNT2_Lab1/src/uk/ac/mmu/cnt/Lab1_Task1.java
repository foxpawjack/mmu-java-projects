package uk.ac.mmu.cnt;

import java.io.*;

public class Lab1_Task1 {

		public static void main(String[] args) throws IOException{
			
			//Declare floats to work out.
			float num1;
			float num2;
			
			//Declare strings so the floats can be printed
			String num1str;
			String num2str;
			
			//Setup a buffered reader to get user input
			BufferedReader console=
					new BufferedReader(new InputStreamReader(System.in));
			
			//Print some filler so the program looks somewhat nice
			System.out.println("CNT2 Lab 1 - Basic Calculator");
			System.out.println("ver 1.0.0 (06/10/15) - No Methods Edition!");
			System.out.println("By Jack Noble - 15081579");
			System.out.println("");
			
			//Read in the values to be worked out.
			System.out.println("Enter Value 1:");
			num1str = console.readLine();
			num1 = Float.parseFloat(num1str);
			
			System.out.println("Enter Value 2:");
			num2str = console.readLine();
			num2 = Float.parseFloat(num2str);
			
			//Do all the operations and remember the save the damn project this time
			System.out.println("");
			System.out.println("Adding Value 1 to Value 2 gets us...");
			System.out.println(num1+num2);
			
			System.out.println("Subtracting Value 1 from Value 2 gets us...");
			System.out.println(num2-num1);
			
			System.out.println("Subtracting Value 2 from Value 1 gets us...");
			System.out.println(num1-num2);
			
			System.out.println("Multiplying the two values gets us...");
			System.out.println(num1*num2);
			
			System.out.println("Dividing Value 1 by Value 2 gets us...");
			System.out.println(num1/num2);
			
			System.out.println("Dividing Value 2 by Value 1 gets us...");
			System.out.println(num2/num1);
			
			System.out.println("");
			System.out.println("All done! Hope you won BIIIIG money!");
		}
}
