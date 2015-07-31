/**
 * 
 */
package com.github.cbpos1989.HeartRateZoneTimes;

import java.util.Calendar;
import java.util.spi.CalendarDataProvider;

/**
 * Class to hold the state and behavior for each entry.
 * 
 * @author Colm O'Sullivan
 *
 */
public class Entry {
	private static Calendar date;
	private int inZonePercentage;
	private int aboveZonePercentage;
	private int belowZonePercentage;
	private int heartRateHigh;
	private int  heartRateLow;
	private int heartRateAverage;
	
	public Entry(){
		this(date.get(Calendar.DAY_OF_MONTH),-1,-1,-1,-1,-1,-1);
	}
	
	public Entry(int date, int inZonePercentage, int aboveZonePercentage, int belowZonePercentage, int heartRateHigh, int  heartRateLow, int heartRateAverage){
		
	}
	
	
	
	
}

enum ZoneType{
	InZone("In-Zone"),
	AboveZone("Above-Zone"),
	BelowZone("BelowZone");
	
	private String displayName;
	
	ZoneType(String displayName){
		this.displayName = displayName;
	}
}
