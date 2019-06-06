package com.lab28.WeatherAPI.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	private ArrayList<Integer> temperature;
	private ArrayList<String> weather;
	
	public Data() {
		super();
	}

	public Data(ArrayList<Integer> temperature, ArrayList<String> weather) {
		super();
		this.temperature = temperature;
		this.weather = weather;
	}

	public ArrayList<Integer> getTemperature() {
		return temperature;
	}

	public void setTemperature(ArrayList<Integer> temperature) {
		this.temperature = temperature;
	}

	public ArrayList<String> getWeather() {
		return weather;
	}

	public void setWeather(ArrayList<String> weather) {
		this.weather = weather;
	}

	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + "]";
	}
	
	

}
