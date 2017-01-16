package uk.ac.mmu.cnt.one;

import java.util.*;

public class L3T2Program {

	public static void main(String[] args) {
		List<L3T2Circle> cList = new ArrayList<L3T2Circle>();
		List<L3T2Rectangle> rList = new ArrayList<L3T2Rectangle>();
		int count = 0;
		
		String circleID,circumference,radius,rectangleID,width,length;
		
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		while(true){
			L3T2Circle cObj = new L3T2Circle();
			L3T2Rectangle rObj = new L3T2Rectangle();
			
			System.out.println("Enter an ID for the circle >");
			circleID = in.nextLine();
			
			System.out.println("Enter the CIRCUMFERENCE of the circle >");
			circumference = in.nextLine();
			
			System.out.println("Enter the RADIUS of the circle >");
			radius = in.nextLine();
			
			System.out.println("Enter an ID for the rectangle >");
			rectangleID = in.nextLine();
			
			System.out.println("Enter the WIDTH of the rectangle >");
			width = in.nextLine();
			
			System.out.println("Enter the LENGTH of the rectangle >");
			length = in.nextLine();
			
			cObj.circleID = circleID;
			cObj.circumference = Double.parseDouble(circumference);
			cObj.radius = Double.parseDouble(radius);
			
			rObj.rectangleID = rectangleID;
			rObj.width = Double.parseDouble(width);
			rObj.length = Double.parseDouble(length);
			
			cList.add(cObj);
			rList.add(rObj);
			
			count++;
			System.out.println("Objects added >>>");
			
			System.out.println("Do you wish to add another set of objects? [1 = Yes/0 = No]");
			if(input.nextInt()==0){break;}
		}
		
		System.out.println("There are > "+count+" objects.");
		for(L3T2Circle s:cList){
			System.out.println(s.displayInfo());
			System.out.println("---------------");
		}
		for(L3T2Rectangle r:rList){
			System.out.println(r.displayInfo());
			System.out.println("---------------");
		}

	}

}
