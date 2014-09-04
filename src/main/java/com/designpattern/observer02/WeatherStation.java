package com.designpattern.observer02;

public class WeatherStation {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		System.out.println();
		
		weatherData.setMeasurements(80.3f, 65.2f, 30.7f);
		System.out.println();

		statisticsDisplay.unRegister();
		weatherData.setMeasurements(82, 70, 29.2f);
		System.out.println();

		weatherData.setMeasurements(78, 90, 29.9f);
	}
	
}
