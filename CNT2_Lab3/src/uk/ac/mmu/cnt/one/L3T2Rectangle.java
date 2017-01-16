package uk.ac.mmu.cnt.one;

public class L3T2Rectangle {
	String rectangleID;
	Double width;
	Double length;
	
	public String displayInfo(){
		return "Rectangle ID: "+rectangleID+"\nWidth: "+width+"\nLength: "+length+"\nThe Area of this rectange is > "+(width*length);
	}
}
