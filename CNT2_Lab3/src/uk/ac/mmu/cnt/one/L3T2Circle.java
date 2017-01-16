package uk.ac.mmu.cnt.one;

public class L3T2Circle {
	String circleID;
	Double circumference;
	Double radius;
	
	public String displayInfo(){
		return "Circle ID: "+circleID+"\nCircumference "+circumference+"\nRadius "+radius+"\nThe Area of this circle is > "+(radius*radius)*Math.PI;
	}
}
