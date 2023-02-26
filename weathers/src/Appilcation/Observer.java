package Appilcation;

/**
 * 抽象观察者Obsever，所有的气象组件都实现此观察者接口。这样，主题在需要通知观察者时有一个共同都接口
 * 采取推送数据当方式
 * All weather components implement this observer interface.
 * In this way, the subject has a common interface when it needs to notify the observer
 */
public interface Observer {

	// 当气象观测值改变时，主题会把这些状态值当作方法当参数，传递给观察者
	// When the weather observation value changes, the subject will pass these state values ​​as parameters to the observer
	public void update(float temp, float humidity, float pressure);
}
