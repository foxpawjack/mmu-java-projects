package uk.ac.mmu.cnt.one;

import java.util.*;

public class L3T2Program {

	public static void main(String[] args) {
		List<L3T2Circle> cList = new ArrayList<L3T2Circle>();
		List<L3T2Rectangle> rList = new ArrayList<L3T2Rectangle>();
		int count = 0,shpSel;
		
		String circleID,circumference,radius,rectangleID,width,length;
		
		Scanner in = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		while(true){
			System.out.println("Do you wish to add a CIRCLE or RECTANGLE?");
			System.out.println("Enter [1] for Circle or [2] for Rectangle >");
			shpSel = input.nextInt();
			
			if(shpSel == 1){
				L3T2Circle cObj = new L3T2Circle();
				
				System.out.println("Enter an ID for the circle >");
				circleID = in.nextLine();
			
				System.out.println("Enter the CIRCUMFERENCE of the circle >");
				circumference = in.nextLine();
			
				System.out.println("Enter the RADIUS of the circle >");
				radius = in.nextLine();
			
				cObj.circleID = circleID;
				cObj.circumference = Double.parseDouble(circumference);
				cObj.radius = Double.parseDouble(radius);
				
				cList.add(cObj);
			}
			
			else if(shpSel == 2){
				L3T2Rectangle rObj = new L3T2Rectangle();
				
				System.out.println("Enter an ID for the rectangle >");
				rectangleID = in.nextLine();
			
				System.out.println("Enter the WIDTH of the rectangle >");
				width = in.nextLine();
			
				System.out.println("Enter the LENGTH of the rectangle >");
				length = in.nextLine();

				rObj.rectangleID = rectangleID;
				rObj.width = Double.parseDouble(width);
				rObj.length = Double.parseDouble(length);
				
				rList.add(rObj);
			}
			
			count++;
			System.out.println("Objects added >>>");
			
			System.out.println("Do you wish to add another object? [1 = Yes/0 = No]");
			if(input.nextInt()==0){break;}
		}
		
		System.out.println("There are > "+count+" objects. ("+cList.size()+" Circles & "+rList.size()+" Rectangles)");
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
