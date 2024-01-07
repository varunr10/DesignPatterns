package com.behavioural.observer;

public class MobileAppObserver implements WeatherObserver {

	private WeatherObservable observable;

	public MobileAppObserver(WeatherObservable observable) 
	{
		this.observable = observable;
	}

	@Override
	public void update() {
		System.out.println("From Mobile app the temperature is " + observable.getTemperature() + " degrees");
	}

}
