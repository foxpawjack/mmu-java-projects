/*
 * CNT 2 - Lab 2 - Task Two
 * Random Number Guesser
 * by Jack Noble
 * 
 * Date: 13/10/2016
 */

package uk.ac.mmu.cnt;

import java.io.*;
import java.util.*;

public class Lab2Task3 {

	public static void main(String[] args) throws IOException{
		//Declare variables and strings
		int randomNum;
		int userNum;
		int t = 0;
		
		//Use the Random expression to set up a RNG
		Random rand = new Random();
		
		String userStr;
		
		//Setup buffered reader
		BufferedReader console=
				new BufferedReader(new InputStreamReader(System.in));
		
		//Generate a random number, randomly. So random.
		randomNum = rand.nextInt(100)+0;
		
		//I've set a max number of attempts to 100, this number could be anything however.
		for(t = 0; t < 100; t++){
			//Get the player to input their guess
			System.out.println("I have thought of a number between 0 and 100, can you guess it?");
			userStr = console.readLine();
			userNum = Integer.parseInt(userStr);
			
			//Check if the guess is lower than the random number
			if(userNum < randomNum){
				System.out.println("Nuh-uh, that number is too low. Try again.");
			}
			//Ditto, but higher
			else if(userNum > randomNum){
				System.out.println("Oh, so close, yet so far, your guess is too high. Try again!");
			}
			else if(userNum == randomNum){
				break;
			}
			else{
				System.out.println("You have somehow managed to break me. Well played.");
			}
		}
		
		//Congratulate the player for winning
		System.out.println("Gah! You did it! How? What powers do you possess?!");
		System.out.println("Heh, looks like it took you " + t + " attempts.");
		System.out.println("Try again, see if you can beat your record!");
	}

}
