package uk.ac.mmu.cnt;

import java.io.*;

public class Lab1_Task3a {

		public static void main(String[] args) throws IOException{
			
			//Declare floats to work out.
			float num1;
			float num2;
			float num1init = 0;
			float num2init = 0;
			
			float add = addNums(num1init, num2init);
			
			//Declare strings so the floats can be printed
			String num1str;
			String num2str;
			
			//Setup a buffered reader to get user input
			BufferedReader console=
					new BufferedReader(new InputStreamReader(System.in));
			
			//Print some filler so the program looks somewhat nice
			System.out.println("CNT2 Lab 1 - Basic Calculator");
			System.out.println("ver 2.0.0 (06/10/15) - Funky Method Edition!");
			System.out.println("By Jack Noble - 15081579");
			System.out.println("");
			
			//Read in the values to be worked out.
			System.out.println("Enter Value 1:");
			num1str = console.readLine();
			num1 = Float.parseFloat(num1str);
			
			System.out.println("Enter Value 2:");
			num2str = console.readLine();
			num2 = Float.parseFloat(num2str);
			
			num1init = num1;
			num2init = num2;
			
			System.out.println(add);
		}
		
		public static float addNums(float num1init, float num2init){
			float ans;
			ans = num1init+num2init;
			return ans;
		}
}
