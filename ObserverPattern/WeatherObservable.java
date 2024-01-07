package com.behavioural.observer;

public interface WeatherObservable {

	public void addObserver(WeatherObserver observer);
	public void removeObserver(WeatherObserver observer);
	public void notifyObservers();
	public void setTemperature(int temp);
	public int getTemperature();
}
