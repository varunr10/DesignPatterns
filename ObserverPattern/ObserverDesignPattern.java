package com.behavioural.observer;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		WeatherObservable observable = new TemperatureObservableImpl();
		
		WeatherObserver observer1 = new BrowserAppObserver(observable);
		WeatherObserver observer2 = new MobileAppObserver(observable);
		WeatherObserver observer3 = new BrowserAppObserver(observable);
		
		observable.addObserver(observer1);
		observable.addObserver(observer2);
		observable.addObserver(observer3);
		
		System.out.println("Three observers are interested now");
		
		observable.setTemperature(3);
		observable.setTemperature(12);
		observable.setTemperature(23);
	}
}
