package Appilcation;

import Interceptor.Application;
import Interceptor.Dispatcher;

import java.util.ArrayList;

/**
 * WeatherData实现了Subject接口
 * WeatherData implements the Subject interface
 */
public class WeatherData implements Subject {
    // 记录观察者列表
	// record watcher list
	private ArrayList observers;
	// WeatherData中的temperature、humidity、pressure这三个属性就是WeatherData的“状态”
	// The three attributes of temperature, humidity, and pressure in WeatherData are the "state" of WeatherData
	private float temperature;
	private float humidity;
	private float pressure;

    // 初始化观察者列表
	// Initialize the observer list
	public WeatherData() {
		observers = new ArrayList();
	}

    // 注册，注册观察者时，只需把观察者参数加入到ArrayList中
	// Registration, when registering an observer, just add the observer parameters to the ArrayList
    @Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

    // 删除：注册观察者时，只需把观察者参数从ArrayList中删除
	// Delete: When registering an observer, just delete the observer parameter from the ArrayList
    @Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

    // 通知列表所有成员，更新数据
	//Notify all members of the list to update data
    @Override
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

    // 当气象站得到新的观测值时，此方法会被调用，通知观察者
	//This method is called when the station gets a new observation, notifying the observer
	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		Application application = new Application();
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		application.startBeforeInterceptor();
		measurementsChanged();
		application.startAfterInterceptor();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
}
