package com.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class TemperatureObservableImpl implements WeatherObservable{

	List<WeatherObserver> observersList = new ArrayList<>();
	int currTemp = 0;

	@Override
	public void notifyObservers() {
		
		for(WeatherObserver observer : observersList) {
			observer.update();
		}
	}

	@Override
	public void setTemperature(int newTemp) {
		if(newTemp - currTemp > 10 || currTemp - newTemp > 10) {
			currTemp = newTemp;
			notifyObservers();
		}
		System.out.println("Temperature now is "+ currTemp + " degrees");
		
	}

	@Override
	public void addObserver(WeatherObserver observer) {
		observersList.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		observersList.remove(observer);		
	}

	@Override
	public int getTemperature() {
		return currTemp;
	}

}
