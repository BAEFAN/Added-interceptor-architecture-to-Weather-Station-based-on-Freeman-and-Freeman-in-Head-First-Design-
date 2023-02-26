package Appilcation;

/**
 * 此布告板实现Observer接口，可以从weatherData对象中获得改变
 * 描述：布告板CurrentConditionsDisplay：显示当前的温度、湿度
 * This bulletin board implements the Observer interface and can get changes from the weatherData object
 * Description: Billboard CurrentConditionsDisplay: Display the current temperature and humidity
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	// 构造器需要 weatherData （主题） 作为注册用
	// Constructor takes weatherData (subject) for registration
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	// 当update被调用时，把湿度和温度保存起来，然后用display
	// When update is called, save the humidity and temperature, and then use display
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
