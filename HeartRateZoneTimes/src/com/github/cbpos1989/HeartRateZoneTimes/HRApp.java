/**
 * 
 */
package com.github.cbpos1989.HeartRateZoneTimes;

/** 
 * App to Calculate Heart Rate Zone Percentages based on user input values.
 * User enters hours, minutes & seconds for overall, InZone, AboveZone & BelowZone Times.
 * Percentages based on each zone time as it relates to the overall Time
 *	 
 * @author Colm O'Sullivan 
 * @version 1.0  
 * @dependencies none
 *  
 *  
 */ 


import java.util.Scanner;

class HRApp{
	private static final String OVERALL_NAME = "Overall";
	private static final String INZONE_NAME = "In-Zone";
	private static final String ABVZONE_NAME = "Above-Zone";
	private static final String BLWZONE_NAME = "Below-Zone";
	
	private int hours = 0;
	private int mins = 0;
	private int secs = 0;
	private int overallTotal = 0;
	private int inZoneTotal = 0;
	private int abvZoneTotal = 0;
	private int blwZoneTotal = 0;
	private double inZonePercentage = 0.0D;
	private double abvZonePercentage = 0.0D;
	private double blwZonePercentage = 0.0D;
	private Scanner scan;
	private HRCalculator hrc = new HRCalculator();

	public static void main(String[] args){
		//System.out.println("Working");
		
		HRApp hrp = new HRApp();
		hrp.intializeMenu();
	}

	//Create Menu and get user input and output final values
	void intializeMenu(){
		hrc = new HRCalculator();
		
		System.out.println("\u0003---\u0003 Heart Rate Zone Calculator \u0003---\u0003");
	
		inputOverallTime(hrc);
		//inputInZoneTime(hrc);
		//inputAbvZoneTime(hrc);
		//inputBlwZoneTime(hrc);
		userOutput(hrc);
	}

	//Allow user to input values for hours, mins & secs
	void userInput(String name){
		scan = new Scanner(System.in);
		//boolean validInput = false;
		
		System.out.println("\n===Enter " + name + " Time===");
		
		
		System.out.print("Enter Hours: ");
		hours = scan.nextInt();
		
		System.out.print("Enter Minutes: ");
		mins = scan.nextInt();

		System.out.print("Enter Seconds: ");
		secs = scan.nextInt();
		
	}

	//Output final sum of user input values
	void userOutput(HRCalculator hrc){
		System.out.println(overallTotal);
		/*if(hrc.checkPercentage(inZonePercentage, abvZonePercentage, blwZonePercentage)){
			
			
			System.out.println("\n***Percentage Totals***\n" 
						+ INZONE_NAME + ": " + Math.round(inZonePercentage) + "%\n" 
						+ ABVZONE_NAME + ": " + Math.round(abvZonePercentage) + "%\n"
						+ BLWZONE_NAME + ": " + Math.round(blwZonePercentage) + "%");
		} else {
			System.out.println("---Incorrect Percentage---");
		}*/
	}

	void inputOverallTime(HRCalculator hrc){
		//userInput(OVERALL_NAME);
		//overallTotal = hrc.calculateUserInput(hours, mins, secs);
		
		HRMenu hrm = new HRMenu(OVERALL_NAME);
		hrm.setVisible(true);
		
	
		
		while (hrm.isMenuEnabled() == false){
			overallTotal = hrm.getTotal();
		}
		
	}
		
	void inputInZoneTime(HRCalculator hrc){
		userInput(INZONE_NAME);
		inZoneTotal = hrc.calculateUserInput(hours, mins, secs);
		inZonePercentage = hrc.calculatePercentage(inZoneTotal, overallTotal);
	}

	void inputAbvZoneTime(HRCalculator hrc){
		userInput(ABVZONE_NAME);
		abvZoneTotal = hrc.calculateUserInput(hours, mins, secs);
		abvZonePercentage = hrc.calculatePercentage(abvZoneTotal, overallTotal);
		
	}
	
	void inputBlwZoneTime(HRCalculator hrc){
		userInput(BLWZONE_NAME);
		blwZoneTotal = hrc.calculateUserInput(hours, mins, secs);
		blwZonePercentage = hrc.calculatePercentage(blwZoneTotal, overallTotal);
	}

}