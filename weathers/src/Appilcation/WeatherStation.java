package Appilcation;

/**
 *Test program
 */
public class WeatherStation {

	public static void main(String[] args) {
		//建立weatherData对象
		//Create a weatherData object
		WeatherData weatherData = new WeatherData();
		//创建3个布告板，并把weatherData对象传给它们
		//Create three bulletin boards and pass weatherData objects to them
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
