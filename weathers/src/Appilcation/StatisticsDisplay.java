package Appilcation;

/**
 * 描述：布告板StatisticsDisplay：显示最小、平均和最大的温度观测值
 * Bulletin board StatisticsDisplay: Displays minimum, average, and maximum temperature observations
 */
public class StatisticsDisplay implements Observer, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum = 0.0f;

	// Record the number of observations in order to calculate the average temperature value
	private int numReadings;// 记录观测的次数以便计算平均温度值
	private Subject weatherData;

	// 构造器需要 weatherData （主题） 作为注册用
	// The constructor requires weatherData (subject) for registration
	public StatisticsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// 把湿度和温度保存起来，然后用display
	// Save the humidity and temperature and use display
	@Override
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings) + "/" + maxTemp + "/" + minTemp);
	}
}
