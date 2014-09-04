package com.designpattern.observer02;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
	}

	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}


	private boolean isObviousChange(float temperature, float humidity, float pressure) {
		return Math.abs(temperature - this.temperature) > 1 || Math.abs(humidity - this.humidity) > 1 || Math.abs(pressure - this.pressure) > 1;
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		
		if (isObviousChange(temperature, humidity, pressure)) {
			this.temperature = temperature;
			this.humidity = humidity;
			this.pressure = pressure;
			
			measurementsChanged();
		}
	}
	
	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

}
