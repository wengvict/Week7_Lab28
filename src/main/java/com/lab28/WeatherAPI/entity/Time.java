package com.lab28.WeatherAPI.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Time {
	
	private ArrayList<String> startPeriodName;

	public Time() {
		super();
	}

	public Time(ArrayList<String> startPeriodName) {
		super();
		this.startPeriodName = startPeriodName;
	}

	public ArrayList<String> getStartPeriodName() {
		return startPeriodName;
	}

	public void setStartPeriodName(ArrayList<String> startPeriodName) {
		this.startPeriodName = startPeriodName;
	}

	@Override
	public String toString() {
		return "Time [startPeriodName=" + startPeriodName + "]";
	}
	
	
}
