package com.designpattern.observer01;

public class ForecastDisplay implements Observer {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public ForecastDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Forecast: " + temperature + "F degrees and " + humidity + "% humidity");
	}
	
	public void unRegister() {
		weatherData.removeObserver(this);
	}

}