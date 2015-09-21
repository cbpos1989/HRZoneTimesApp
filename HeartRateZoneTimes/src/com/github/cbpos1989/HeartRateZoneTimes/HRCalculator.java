/**
 * 
 */
package com.github.cbpos1989.HeartRateZoneTimes;

/** 
 * Class that will receive values from HRApp{} and return total time in seconds and calculate the percentage values.
 *	 
 * @author Colm O'Sullivan 
 * 
 *  
 *  
 */ 

class HRCalculator{
	
	//Take in users values and out total number of secs
	int calculateUserInput(int hours, int mins, int secs){
		hours *= 60;
		mins = (hours + mins) * 60;
		return mins + secs;
	}

	
	double calculatePercentage(int inputValue, int overallValue){
		return (double)((inputValue/overallValue) * 100.0D);
		
	}

	//Makes sure all three percentage values total up to 100%
	boolean checkPercentage(double inZonePercentage, double abvZonePercentage, double blwZonePercentage){
		return (Math.round((inZonePercentage + abvZonePercentage + blwZonePercentage)) == 100);
	}

}