package com.behavioural.observer;

public class BrowserAppObserver implements WeatherObserver{
	
	private WeatherObservable observable;
	
	public BrowserAppObserver(WeatherObservable observable) 
	{
		this.observable = observable;
	}
	
	@Override
	public void update() {
		System.out.println("From Browser the temperature is " + observable.getTemperature() + " degrees");
	}

}
