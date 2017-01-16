package uk.ac.mmu.cnt.one;

/*
 * Lab 3 Task 1 - Part 3 - OOP
 * By Jack Noble
 * Version: 1.0.0
 * Created: 19/10/2016
 */

public class L3T1c {
	String DOB;
	String name;
	String address;
	String ID;
	String course;
	String faculty;
	
	public String displayInfo(){
		return "ID: "+ID+"\nName :"+name+"\nDOB :"
				+DOB+"\nAddress: "+address+" "+
				"\nCourse :"+course+"\nFaculty :"+
				faculty;
	}
}
