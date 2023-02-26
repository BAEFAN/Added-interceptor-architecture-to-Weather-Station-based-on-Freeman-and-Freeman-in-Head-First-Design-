package Appilcation;

/**
 * 抽象主题Subject（发布者、被观察者）
 * Subject (publisher, observer)
 */
public interface Subject {

    /**
     * 注册观察者
     * register observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * remove observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者，当主题状态改变时，这个方法会被调用，以通知所有当观察者
     * Notify observers. This method is called to notify all observers when the topic state changes
     */
    void notifyObservers();
}
