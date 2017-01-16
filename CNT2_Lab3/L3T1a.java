package uk.ac.mmu.cnt.one;

/*
 * Lab 3 Task 1 - Part 1 - Arrays
 * By Jack Noble
 * Version: 1.0.0
 * Created: 19/10/2016
 */

import java.util.*;

public class L3T1a {

	public static void main(String[] args) {
		int numbers[];
		numbers = new int[10];
		
		Random random = new Random();
		
		numbers[0] = 10;
		
		for(int i=0; i<10; ++i){
			numbers[i] = random.nextInt(100);
		}
		
		int popout = numbers[5];
		System.out.println("6th elemet is>" + popout);
		
		for(int i=0; i<10; ++i){
			System.out.println("Element ["+i+ "]>"+numbers[i]);
		}
	}

}
