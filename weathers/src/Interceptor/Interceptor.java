package Interceptor;

public interface Interceptor {

    //气象数据发生改变(前)进行拦截（比如校验 发生改变的气象数据是否有效？）
    //The weather data changes (before) to intercept
    //(for example, check whether the changed weather data is valid?)
    public void beforeMeasurementChanged(ContextObject contextObject);
    //气象数据发生改变(后)进行拦截（比如气象数据发生改变后，对其进行拦截并完成数据记录、数据统计行为）
    //The meteorological data changes (after) to intercept
    //(for example, after the weather data changes, intercept it and complete the data recording and data statistics behavior)
    public void afterMeasurementChanged(ContextObject contextObject);
}
