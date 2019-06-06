package com.lab28.WeatherAPI.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
	
	private String productionCenter;
	private Location location;
	private Time time;
	private Data data;
	
	public Weather() {
		super();
	}

	public Weather(String productionCenter, Location location, Time time, Data data) {
		super();
		this.productionCenter = productionCenter;
		this.location = location;
		this.time = time;
		this.data = data;
	}
	
	public String getProductionCenter() {
		return productionCenter;
	}

	public void setProductionCenter(String productionCenter) {
		this.productionCenter = productionCenter;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}
	
	

}
