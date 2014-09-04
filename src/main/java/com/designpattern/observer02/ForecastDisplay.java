package com.designpattern.observer02;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

	private Observable observable;
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("The Pressure has been changed from " + lastPressure + " to " + currentPressure);
	}

	public void update(Observable observable, Object arg) {
		if (observable instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) observable;
			lastPressure = currentPressure;
			currentPressure = weatherData.getPressure();
			display();
		}
	}

	public float getLastPressure() {
		return lastPressure;
	}

	public void setLastPressure(float lastPressure) {
		this.lastPressure = lastPressure;
	}
	
	public void unRegister() {
		observable.deleteObserver(this);
	}

}
