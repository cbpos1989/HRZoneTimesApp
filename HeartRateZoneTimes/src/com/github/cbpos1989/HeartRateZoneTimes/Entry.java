/**
 * 
 */
package com.github.cbpos1989.HeartRateZoneTimes;

import java.util.Calendar;

/**
 * Class to hold the state and behavior for each entry.
 * 
 * @author Colm O'Sullivan
 *
 */
public class Entry {
	private Calendar date;
	private int inZonePercentage;
	private int aboveZonePercentage;
	private int belowZonePercentage;
	private int heartRateHigh;
	private int  heartRateLow;
	private int heartRateAverage;
	
	public Entry(){
		this(Calendar.getInstance(),-1,-1,-1,-1,-1,-1);
	}
	
	public Entry(Calendar date, int inZonePercentage, int aboveZonePercentage, int belowZonePercentage, int heartRateHigh, int  heartRateLow, int heartRateAverage){
		this.setDate(date);
		this.setInZonePercentage(inZonePercentage);
		this.setAboveZonePercentage(aboveZonePercentage);
		this.setBelowZonePercentage(belowZonePercentage);
		this.setHeartRateHigh(heartRateHigh);
		this.setHeartRateLow(heartRateLow);
		this.setHeartRateAverage(heartRateAverage);
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public int getInZonePercentage() {
		return inZonePercentage;
	}

	public void setInZonePercentage(int inZonePercentage) {
		this.inZonePercentage = inZonePercentage;
	}

	public int getAboveZonePercentage() {
		return aboveZonePercentage;
	}

	public void setAboveZonePercentage(int aboveZonePercentage) {
		this.aboveZonePercentage = aboveZonePercentage;
	}

	public int getBelowZonePercentage() {
		return belowZonePercentage;
	}

	public void setBelowZonePercentage(int belowZonePercentage) {
		this.belowZonePercentage = belowZonePercentage;
	}

	public int getHeartRateHigh() {
		return heartRateHigh;
	}

	public void setHeartRateHigh(int heartRateHigh) {
		this.heartRateHigh = heartRateHigh;
	}

	public int getHeartRateLow() {
		return heartRateLow;
	}

	public void setHeartRateLow(int heartRateLow) {
		this.heartRateLow = heartRateLow;
	}

	public int getHeartRateAverage() {
		return heartRateAverage;
	}

	public void setHeartRateAverage(int heartRateAverage) {
		this.heartRateAverage = heartRateAverage;
	}
	
	public String toString(){
		return "Date: " + getDate() + "In Zone %: " + getInZonePercentage();
	}
}

enum ZoneType{
	InZone("In-Zone"),
	AboveZone("Above-Zone"),
	BelowZone("BelowZone");
	
	private String displayName;
	
	ZoneType(String displayName){
		this.setDisplayName(displayName);
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
}
