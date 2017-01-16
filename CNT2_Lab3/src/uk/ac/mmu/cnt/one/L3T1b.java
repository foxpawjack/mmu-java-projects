package uk.ac.mmu.cnt.one;

/*
 * Lab 3 Task 1 - Part 2 - ArrayList
 * By Jack Noble
 * Version: 1.0.0
 * Created: 19/10/2016
 */

import java.util.*;

public class L3T1b {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		
		Random random = new Random();
		
		numbers.add(10000);
		
		for(int i=0; i<10; ++i){
			numbers.add(random.nextInt(100));
		}
		
		int popout = numbers.get(5);
		System.out.println("The 6th element is>" + popout);
		
		for(int value:numbers){
			System.out.println(value);
		}
	}

}
