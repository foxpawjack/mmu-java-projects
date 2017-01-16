package uk.ac.mmu.cnt.one;

/*
 * Lab 3 Task 1 - Part 3 - OOP 2
 * By Jack Noble
 * Version: 1.0.0
 * Created: 19/10/2016
 */

import java.util.*;

public class L3T1c1 {

	public static void main(String[] args) {
		List<L3T1c> sList = new ArrayList<L3T1c>();
		int count = 0;
		
		String dob,name,address,id,course,faculty;
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		while(true){
			L3T1c sObj = new L3T1c();
			
			System.out.println("Enter name >");
			name = in.nextLine();
			
			System.out.println("Enter address >");
			address = in.nextLine();
			
			System.out.println("Enter D.O.B. >");
			dob = in.nextLine();
			
			System.out.println("Enter ID >");
			id = in.nextLine();
			
			System.out.println("Enter course >");
			course = in.nextLine();
			
			System.out.println("Enter faculty >");
			faculty = in.nextLine();
			
			sObj.name = name;
			sObj.address = address;
			sObj.DOB = dob;
			sObj.ID = id;
			sObj.course = course;
			sObj.faculty = faculty;
			
			sList.add(sObj);
			
			count++;
			System.out.println("Object added...");
			
			System.out.println("Do you wish to continue? 1=Yes/0=No");
			if(input.nextInt()==0){break;}
		}
		
		System.out.println("There are total "+count+" objects");
		for(L3T1c s:sList){
			System.out.println(s.displayInfo());
			System.out.println("------------");
		}

	}

}
