package com.lab28.WeatherAPI.entity;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
	
	private ArrayList<Integer> temperature;
	private ArrayList<String> weather;
	private ArrayList<String> text;
	
	public Data() {
		super();
	}

	
	public Data(ArrayList<Integer> temperature, ArrayList<String> weather, ArrayList<String> text) {
		super();
		this.temperature = temperature;
		this.weather = weather;
		this.text = text;
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


	public ArrayList<String> getText() {
		return text;
	}


	public void setText(ArrayList<String> text) {
		this.text = text;
	}


	@Override
	public String toString() {
		return "Data [temperature=" + temperature + ", weather=" + weather + ", text=" + text + "]";
	}

	
	
	

}
